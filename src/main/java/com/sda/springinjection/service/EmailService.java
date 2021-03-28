package com.sda.springinjection.service;

public class EmailService implements MessageService{
    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Email sent to: " + rec + " with message: " + msg);
        return true;
    }
}
