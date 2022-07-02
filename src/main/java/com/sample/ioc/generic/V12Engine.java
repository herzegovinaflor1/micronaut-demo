package com.sample.ioc.generic;

import jakarta.inject.Singleton;

@Singleton
public class V12Engine implements GenericEngine<V12> {
    @Override
    public V12 getCylinderProvider() {
        return new V12();
    }
}
