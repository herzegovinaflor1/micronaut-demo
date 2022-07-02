package com.sample.ioc.generic;

import jakarta.inject.Singleton;

@Singleton
public class V2 implements CylinderProvider {
    @Override
    public int getCylinders() {
        return 2;
    }
}
