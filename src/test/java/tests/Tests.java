package tests;

import org.junit.jupiter.api.Test;
import org.spring_practice.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.spring_practice.steps.PostSteps;

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
