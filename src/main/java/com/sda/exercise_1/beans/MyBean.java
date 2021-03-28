package com.sda.exercise_1.beans;

import org.springframework.stereotype.Component;


@Component
public class MyBean {
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String sayHello() {
        return "Hello! " + name;
    }
}
