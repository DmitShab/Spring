package org.spring_practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondClass {
    FirstClass firstClass;
@Autowired
    public SecondClass(FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    public int secondClassMethod(){
        System.out.println("secondClassMethod");
        int result = firstClass.firstClassMethod() +1;
        return result;
    }
}
