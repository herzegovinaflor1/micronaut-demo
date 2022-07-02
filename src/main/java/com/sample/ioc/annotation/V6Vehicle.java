package com.sample.ioc.annotation;

import com.sample.ioc.Engine;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class V6Vehicle {

    private final Engine engine;

    @Inject public V6Vehicle(@Cylinders(6) Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }

}
