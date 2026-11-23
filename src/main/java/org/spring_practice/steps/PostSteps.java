package org.spring_practice.steps;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.spring_practice.apiendpoint.PostApi;
import org.spring_practice.pojo.PostRequestRequest;
import org.spring_practice.pojo.PostRequestResponse;
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
    @Description("Проверка сценария такого-то такого-то...")
    public void sendValidPostRequest(){
        Object body = data.defaultPost().title("Hello").build();
        postApi.postRequest(body);
    }
}
