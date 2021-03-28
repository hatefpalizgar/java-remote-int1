package com.sda.dependencyinjection.injector;

import com.sda.dependencyinjection.consumer.Consumer;
import com.sda.dependencyinjection.consumer.MyDIApplication;
import com.sda.dependencyinjection.service.SMSServiceImpl;


public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }
}
