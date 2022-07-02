package com.sample.ioc;

import io.micronaut.context.BeanContext;

public class MainStart {

    public static void main(String[] args) {
        BeanContext beanContext = BeanContext.run();
        Vehicle vehicle = beanContext.getBean(Vehicle.class);
        System.out.println(vehicle.start());

        AnyVehicle anyVehicle = beanContext.getBean(AnyVehicle.class);
        anyVehicle.start();
    }

}
