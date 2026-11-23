package org.spring_practice.apiendpoint;

import io.restassured.response.Response;
import org.spring_practice.basehttpclient.BaseHttpClient;
import org.spring_practice.pojo.PostRequestResponse;
import org.springframework.stereotype.Component;

@Component
public class PostApi extends BaseHttpClient {
    private final String apiPath = "/posts/";

    public Response postRequest(Object body) {
        return doPostRequest(apiPath, body);
    }
}
