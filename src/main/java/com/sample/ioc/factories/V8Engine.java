package com.sample.ioc.factories;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
public class V8Engine {
    private final int cylinders;

    public V8Engine(@Named("v8") int cylinders) { //
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }
}
