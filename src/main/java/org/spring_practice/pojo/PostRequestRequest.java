package org.spring_practice.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostRequestRequest {
    private Integer userId;
    private Integer id;
    private String title;
    private String body;
}

