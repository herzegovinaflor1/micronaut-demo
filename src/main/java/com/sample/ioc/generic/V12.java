package com.sample.ioc.generic;

import jakarta.inject.Singleton;

@Singleton
public class V12 implements CylinderProvider {
    @Override
    public int getCylinders() {
        return 12;
    }
}
