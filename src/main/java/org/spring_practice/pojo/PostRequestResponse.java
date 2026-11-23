package org.spring_practice.pojo;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.*;

@Data
public class PostRequestResponse {

    private Integer userId;
    private Integer id;
    private String title;
    private String body;

}
