package com.sda.exercise_2;

import com.sda.exercise_2.beans.Holiday;
import com.sda.exercise_2.beans.TravelAgency;
import com.sda.exercise_2.configuration.AppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        // create an instance of Holiday
        // set its greeting to 'Happy new year'
        // create an instance of TravelAgency
        // add holiday to it
        // set the travel agency message to 'Hoooray!!'
        // call hello method of travel agency object
        // print out the travel agency message content
//        Holiday holiday= new Holiday();
//        holiday.setDay(10);
//        holiday.setMonth(5);
//        holiday.setGreeting("Happy new year");
//        TravelAgency travelAgency = new TravelAgency();
//        travelAgency.setHolidayList(Arrays.asList(holiday)); // here is the injection
//        travelAgency.setMessage("Hoooray!!");
//        travelAgency.hello();
//        System.out.println(travelAgency.getMessage());
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        TravelAgency taFromContext = context.getBean(TravelAgency.class);
        taFromContext.setMessage("Hooray!!");
        taFromContext.hello();
        for (Holiday h : taFromContext.getHolidayList()) {
            System.out.println(h);
        }
//        taFromContext.getHolidayList().forEach(holiday-> System.out.println(holiday.getGreeting()));
    }
}
