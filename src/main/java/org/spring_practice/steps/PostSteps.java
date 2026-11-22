package org.spring_practice.steps;

import org.spring_practice.apiendpoint.PostApi;
import org.spring_practice.pojo.PostRequestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostSteps {
    @Autowired
    PostApi postApi;

    public PostRequestResponse body = PostRequestResponse.builder()
            .userId(1)
            .id(1)
            .body("testInput1")
            .build();

    public void sendValidPostRequest(){
        postApi.postRequest(body);
    }
}
