package com.sda.springinjection.configuration;

import com.sda.springinjection.service.EmailService;
import com.sda.springinjection.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Annotation-based configuration
@Configuration
@ComponentScan(value = {"com.sda.springinjection.consumer"})
public class DIConfiguration {
    
    @Bean
    public MessageService getMessageService() {
        return new EmailService();
    }
    
    // Configuration metadata in Spring can be done in several ways: 1. Annotation  2. XML  3. Java
}
