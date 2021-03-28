package com.sda.dependencyinjection;

import com.sda.dependencyinjection.consumer.Consumer;
import com.sda.dependencyinjection.injector.EmailServiceInjector;
import com.sda.dependencyinjection.injector.MessageServiceInjector;
import com.sda.dependencyinjection.injector.SMSServiceInjector;


public class MyMessageDITest {
    public static void main(String[] args) {
        String msg = "Hi Hatef";
        String email= "hatef@abc.com";
        String phone = "123456789";
        MessageServiceInjector injector;
        Consumer app;
        
        // Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessage(msg, email);
        
        // Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessage(msg,phone);
    }
}
