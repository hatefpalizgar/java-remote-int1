package com.sda.dependencyinjection.consumer;

public interface Consumer {
    void processMessage(String msg, String rec);
}
