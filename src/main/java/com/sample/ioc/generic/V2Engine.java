package com.sample.ioc.generic;

import jakarta.inject.Singleton;

@Singleton
public class V2Engine implements GenericEngine<V2> {
    @Override
    public V2 getCylinderProvider() {
        return new V2();
    }
}
