package tests;

import org.junit.jupiter.api.Test;
import org.spring_practice.AppConfig;
import org.spring_practice.apiendpoint.PostApi;
import org.spring_practice.pojo.PostRequestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import steps.PostSteps;

@SpringBootTest(classes = AppConfig.class)
@ActiveProfiles("dev")
public class Tests {
    @Autowired
    PostSteps steps;

    @Test
    public void doPostRequest() {
        steps.sendValidPostRequest();
    }
}
