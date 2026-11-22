package org.spring_practice.basehttpclient;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.spring_practice.config.ConfigParams;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static io.restassured.RestAssured.given;

public abstract class BaseHttpClient {
    @Autowired
    ConfigParams config;
    public RequestSpecification spec() {
       return new RequestSpecBuilder()
                .setBaseUri(config.postHost)
                .setContentType(ContentType.JSON)
                .setRelaxedHTTPSValidation()
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new ErrorLoggingFilter())
                .build();
    }
    protected Response doGetRequest(String path) {
        return given()
                .spec(spec())
                .get(path);

    }

    protected Response doPostRequest(String path, Object body) {
        return given()
                .spec(spec())
                .body(body)
                .post(path);
    }
}
