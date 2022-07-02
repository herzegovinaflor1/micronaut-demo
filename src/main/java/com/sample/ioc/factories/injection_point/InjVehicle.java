package com.sample.ioc.factories.injection_point;

import com.sample.ioc.Engine;
import jakarta.inject.Singleton;

@Singleton
public class InjVehicle {

    private final Engine engine;

    InjVehicle(@InjCylinders(value = 7, value2 = 9) Engine engine) {
        this.engine = engine;
    }

    String start() {
        return engine.start();
    }

}
