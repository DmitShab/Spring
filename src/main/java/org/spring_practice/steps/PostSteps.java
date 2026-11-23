package org.spring_practice.steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.spring_practice.apiendpoint.PostApi;
import org.spring_practice.testdata.TestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostSteps {
    @Autowired
    PostApi postApi;
    @Autowired
    TestData data;

    @Step("Отправка валидного post запроса")
    public Response sendValidPostRequest(){
        Object body = data.defaultPost().build();
        Response response = postApi.postRequest(body);
        validateResponseCode(response);
        return response;
    }
    @Step("Валидирование ответа 201")
    public void validateResponseCode(Response response){
        response.then().statusCode(201);
    }
}
