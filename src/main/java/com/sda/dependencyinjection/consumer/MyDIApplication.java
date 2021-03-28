package com.sda.dependencyinjection.consumer;

import com.sda.dependencyinjection.service.MessageService;


public class MyDIApplication implements Consumer{
    private MessageService service;
    
    public MyDIApplication(MessageService service) {   // Hollywood: Don't call us, we will call you
        this.service = service;
    }
    
    @Override
    public void processMessage(String msg, String rec) {
        this.service.sendMessage(msg,rec);
    }
}
