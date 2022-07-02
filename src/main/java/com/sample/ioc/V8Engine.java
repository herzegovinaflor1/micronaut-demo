package com.sample.ioc;

import jakarta.inject.Singleton;

@Singleton
public class V8Engine implements Engine {
    @Override
    public int getCylinders() {
        return 8;
    }

    @Override
    public String start() {
        return "Starting V8";
    }
}
