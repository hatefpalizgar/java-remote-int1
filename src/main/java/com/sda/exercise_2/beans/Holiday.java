package com.sda.exercise_2.beans;

import org.springframework.stereotype.Component;


// simple Bean / POJO
@Component
public class Holiday {
    private int month;
    private int day;
    private String greeting;
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int month) {
        this.month = month;
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        this.day = day;
    }
    
    public String getGreeting() {
        return greeting;
    }
    
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    
    @Override
    public String toString() {
        return "Holiday{" +
                "month=" + month +
                ", day=" + day +
                ", greeting='" + greeting + '\'' +
                '}';
    }
}
