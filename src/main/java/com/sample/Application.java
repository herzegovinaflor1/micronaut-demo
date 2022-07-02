package com.sample;

import com.sample.ioc.Vehicle;
import io.micronaut.context.BeanContext;
import io.micronaut.runtime.Micronaut;

public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);

        BeanContext beanContext = BeanContext.run();
        Vehicle vehicle = beanContext.getBean(Vehicle.class);
        System.out.println(vehicle.start());

    }
}
