package com.sample.ioc.generic;

import io.micronaut.context.BeanContext;

public class Main {

    public static void main(String[] args) {
        BeanContext beanContext = BeanContext.run();
        GenericVehicle vehicle = beanContext.getBean(GenericVehicle.class);
        System.out.println(vehicle.start());
    }

}
