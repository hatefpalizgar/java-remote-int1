package com.sda.springinjection;

import com.sda.springinjection.configuration.DIConfiguration;
import com.sda.springinjection.consumer.MyApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ClientApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        // Hollywood: Don't call us, we will call you
        // ask Spring Context to provide me with MyApplication instance
        MyApplication app = context.getBean(MyApplication.class);
        app.processMessage("Hi Hatef", "hatef@abc.com");
        
        // close context
        context.close();
    }
}
