package com.sample.ioc.generic;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class GenericVehicle {

    private final GenericEngine<V12> engine;

    @Inject
    public GenericVehicle(GenericEngine<V12> engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }

}
