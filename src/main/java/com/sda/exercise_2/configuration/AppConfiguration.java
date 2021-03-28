package com.sda.exercise_2.configuration;

import com.sda.exercise_2.beans.Holiday;
import com.sda.exercise_2.beans.TravelAgency;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;


@Configuration
@ComponentScan(value = "com.sda.exercise_2.beans")
public class AppConfiguration {
    @Bean
    public Holiday christmas() {
       Holiday theChristmas = new Holiday();
        theChristmas.setGreeting("Happy new year");
        theChristmas.setMonth(5);
        theChristmas.setDay(10);
        return theChristmas;
    }
    
    @Bean
    public Holiday madisepaev() {
        Holiday theMadisepaev = new Holiday();
        theMadisepaev.setGreeting("Happy Madisepaev");
        theMadisepaev.setMonth(5);
        theMadisepaev.setDay(10);
        return theMadisepaev;
    }
    
    @Bean
    public TravelAgency travelAgency(List<Holiday> holidayList) {
        TravelAgency travelAgency = new TravelAgency();
        travelAgency.setMessage("This is a message from Travel Agency BEAN");
        travelAgency.setHolidayList(holidayList);
        return travelAgency;
    }
}
