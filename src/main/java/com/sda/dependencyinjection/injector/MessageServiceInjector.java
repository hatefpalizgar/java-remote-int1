package com.sda.dependencyinjection.injector;

import com.sda.dependencyinjection.consumer.Consumer;


public interface MessageServiceInjector {
    public Consumer getConsumer();
}
