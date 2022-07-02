package com.sample.ioc.factories;

import io.micronaut.context.BeanContext;

public class Main {

    public static void main(String[] args) {
        BeanContext beanContext = BeanContext.run();
        V8Engine engine = beanContext.getBean(V8Engine.class);
        System.out.println(engine.getCylinders());
    }

}
