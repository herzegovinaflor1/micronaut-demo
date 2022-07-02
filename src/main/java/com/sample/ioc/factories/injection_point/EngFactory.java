package com.sample.ioc.factories.injection_point;

import com.sample.ioc.Engine;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Prototype;
import io.micronaut.inject.InjectionPoint;

@Factory
public class EngFactory {

    @Prototype
    Engine v7Engine(InjectionPoint<?> injectionPoint) {
        int cylinders = injectionPoint
                .getAnnotationMetadata()
                .intValue(InjCylinders.class)
                .orElse(8);
        if (cylinders == 7) {
            return new InjV7Engine();
        }
        throw new IllegalArgumentException("Unsupported number of cylinders specified: " + cylinders);
    }

}
