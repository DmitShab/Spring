package org.spring_practice.baseHttpClient;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.spring_practice.config.ConfigParams;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static io.restassured.RestAssured.given;

public abstract class BaseHttpClient {
    @Autowired
    ConfigParams config;
    public RequestSpecification baseRequestSpecBuilder =
            new RequestSpecBuilder()
                    .setBaseUri(config.postHost)
                    .addHeader("Content-Type", "application/json")
                    .setRelaxedHTTPSValidation()
                    .addFilter(new RequestLoggingFilter())
                    .addFilter(new ResponseLoggingFilter())
                    .addFilter(new ErrorLoggingFilter())
                    .build();

    protected Response doGetRequest(String path, Map<String, Integer> params) {
        return given()
                .spec(baseRequestSpecBuilder)
                .get(path)
                .thenReturn();
    }

    protected Response doPostRequest(String path, Object body) {
        return given()
                .spec(baseRequestSpecBuilder)
                .body(body)
                .post(path)
                .thenReturn();
    }
}
