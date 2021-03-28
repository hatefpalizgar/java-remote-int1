package com.sda.springinjection.consumer;

import com.sda.springinjection.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MyApplication {
    
    // DI using field-injection
//    @Autowired
//    private MessageService service;
    
    private MessageService service;
    
    // DI using constructor-injection
    @Autowired
    public MyApplication(MessageService service) {
        this.service = service;
    }
    
    // DI using setter-injection / field-injection
//    @Autowired
//    public void setService(MessageService service) {
//        this.service = service;
//    }
    
    public boolean processMessage(String msg, String rec) {
        return service.sendMessage(msg, rec);
    }
}
