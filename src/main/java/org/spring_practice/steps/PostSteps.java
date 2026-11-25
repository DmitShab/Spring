package org.spring_practice.steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.spring_practice.apiendpoint.PostApi;
import org.spring_practice.pojo.PostRequestRequest;
import org.spring_practice.pojo.PostRequestResponse;
import org.spring_practice.testdata.TestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.junit.jupiter.api.Assertions;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Component
public class PostSteps {
    @Autowired
    PostApi postApi;
    @Autowired
    TestData data;

//    @Step("Отправка валидного post запроса")
//    public PostRequestResponse sendValidPostRequest(PostRequestRequest body) {
//        Response response = postApi.postRequest(body);
//        validResponseCode201(response);
//        return response.as(PostRequestResponse.class);
//    }
    @Step("Отправка валидного post запроса")
    public Response sendValidPostRequest(PostRequestRequest body) {
        return postApi.postRequest(body);
    }

    @Step("Валидирование ответа 201")
    public void validResponseCode201(Response response) {
        response.then().statusCode(201);
    }
    @Step("Валидирование ответа 200")
    public void validResponseCode200(Response response) {
        response.then().statusCode(201);
    }

    @Step("Валидирование ответа 400")
    public void invalidResponseCode400(Response response) {
        response.then().statusCode(400).and().body("message", equalTo("Неверный тайл"));
    }
    @Step("Валидирование ответа 404")
    public void invalidResponseCode404(Response response) {
        response.then().statusCode(404);
    }

    @Step("Валидация параметров ответа")
    public void validateResponse(PostRequestRequest body, PostRequestResponse response) {
        Assertions.assertAll(
                () -> assertEquals(body.getId(), response.getId()),
                () -> assertEquals(body.getBody(), response.getBody()),
                () -> assertEquals(body.getUserId(), response.getUserId()),
                () -> assertEquals(body.getTitle(), response.getTitle())
        );
    }

    @Step("Проверка сценария №1")
    public void checkScenario1() {
        PostRequestRequest body = data.defaultPost().build();
        Response response = sendValidPostRequest(body);
        validResponseCode201(response);
        validateResponse(body, response.as(PostRequestResponse.class));
    }
}
