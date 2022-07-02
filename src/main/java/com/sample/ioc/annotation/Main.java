package com.sample.ioc.annotation;

import io.micronaut.context.BeanContext;

public class Main {

    public static void main(String[] args) {
        BeanContext beanContext = BeanContext.run();
        V6Vehicle vehicle = beanContext.getBean(V6Vehicle.class);
        System.out.println(vehicle.start());
    }

}
