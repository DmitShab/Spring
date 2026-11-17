import com.jayway.jsonpath.internal.function.sequence.First;
import org.junit.jupiter.api.Test;
import org.spring_practice.FirstClass;
import org.spring_practice.SecondClass;
import org.springframework.beans.factory.annotation.Autowired;

public class Tests {
    @Autowired
    SecondClass secondClass;
    @Test
    public void test1(){
        System.out.println(secondClass.secondClassMethod());
    }
}
