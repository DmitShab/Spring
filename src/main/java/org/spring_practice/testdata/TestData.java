package org.spring_practice.testdata;

import net.datafaker.Faker;
import org.spring_practice.pojo.PostRequestRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestData {
    @Autowired
    Faker faker;

    public PostRequestRequest.PostRequestRequestBuilder defaultPost() {
        return PostRequestRequest.builder()
                .userId(faker.number().positive())
                .id(faker.number().positive())
                .body(faker.lorem().sentence())
                .title(faker.lorem().sentence());
    }
}
