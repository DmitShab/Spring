import org.junit.jupiter.api.Test;
import org.spring_practice.apiEndPoint.PostApi;
import org.spring_practice.pojo.PostRequestResponse;
import org.springframework.beans.factory.annotation.Autowired;

public class Tests {
    @Autowired
    PostApi postApi;

    @Test
    public void doPostRequest() {
        PostRequestResponse body = new PostRequestResponse(1,1,"hi", "testInput1");
        postApi.postRequest(body);
    }
}
