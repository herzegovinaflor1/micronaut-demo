package com.sample.ioc;

import io.micronaut.context.BeanProvider;
import io.micronaut.context.annotation.Any;
import jakarta.inject.Singleton;

@Singleton
public class AnyVehicle {

    private final BeanProvider<Engine> engineProvider;

    public AnyVehicle(@Any BeanProvider<Engine> engineProvider) {
        this.engineProvider = engineProvider;
    }

    public void start() {
        engineProvider.stream()
                .map(Engine::start)
                .findFirst()
                .ifPresent(System.out::println);
    }

}
