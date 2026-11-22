package org.spring_practice.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostRequestResponse {

    private Integer userId;
    private Integer id;
    private String title;
    private String body;

}
