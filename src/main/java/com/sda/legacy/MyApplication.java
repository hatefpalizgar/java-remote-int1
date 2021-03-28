package com.sda.legacy;

public class MyApplication {
    private EmailService emailService = new EmailService();
    
    
    public void processMessages(String msg, String rec){
        emailService.sendEmail(msg,rec);
    }
}
