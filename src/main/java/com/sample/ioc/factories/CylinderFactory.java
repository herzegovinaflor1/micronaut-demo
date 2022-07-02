package com.sample.ioc.factories;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Named;

@Factory
public class CylinderFactory {

    @Bean
    @Named("v8")
    final int v8 = 8;

    @Bean
    @Named("v12")
    final int v12 = 12;

}
