package org.spring_practice.apiendpoint;

import org.spring_practice.basehttpclient.BaseHttpClient;
import org.spring_practice.pojo.PostRequestResponse;
import org.springframework.stereotype.Component;

@Component
public class PostApi extends BaseHttpClient {
    private final String apiPath = "/posts/";

    public PostRequestResponse postRequest(Object body) {
        return doPostRequest(apiPath, body).as(PostRequestResponse.class);
    }
}
