package com.sda.dependencyinjection.injector;

import com.sda.dependencyinjection.consumer.Consumer;
import com.sda.dependencyinjection.consumer.MyDIApplication;
import com.sda.dependencyinjection.service.EmailServiceImpl;


public class EmailServiceInjector implements MessageServiceInjector{
    @Override
    public Consumer getConsumer() {
        MyDIApplication app = new MyDIApplication(new EmailServiceImpl());
        return app;
    }
}
