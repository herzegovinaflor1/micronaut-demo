package com.sample.ioc;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
public class Vehicle {

    private final Engine engine;

    public Vehicle(@Named("v8") Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }

}
