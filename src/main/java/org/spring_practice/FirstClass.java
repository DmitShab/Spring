package org.spring_practice;

import org.springframework.stereotype.Component;

@Component
public class FirstClass {
    public int firstClassMethod(){
        System.out.println("firstClassMethod");
        return 1;
    }
}
