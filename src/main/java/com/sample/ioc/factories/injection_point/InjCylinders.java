package com.sample.ioc.factories.injection_point;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.PARAMETER})
public @interface InjCylinders {

    int value();

    int value2();

}
