package com.sample.ioc.factories.injection_point;

import io.micronaut.context.BeanContext;

public class Main {

    public static void main(String[] args) {
        BeanContext beanContext = BeanContext.run();
        InjVehicle engine = beanContext.getBean(InjVehicle.class);
        System.out.println(engine.start());
    }

}
