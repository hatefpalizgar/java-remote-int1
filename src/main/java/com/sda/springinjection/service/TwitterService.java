package com.sda.springinjection.service;

public class TwitterService implements MessageService{
    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Twitter message sent to: " + rec + " with message: " + msg);
        return true;
    }
}
