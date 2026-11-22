package org.spring_practice.pojo;

import lombok.Builder;
import lombok.Data;

//@Data
//@Builder
public class PostRequestResponse {

    private Integer userId;
    private Integer id;
    private String title;
    private String body;

    public PostRequestResponse(Integer userId, Integer id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
}
