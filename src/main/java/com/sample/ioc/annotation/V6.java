package com.sample.ioc.annotation;

import com.sample.ioc.Engine;
import jakarta.inject.Singleton;

@Singleton
@Cylinders(value = 6, description = "soem descr")
public class V6 implements Engine {
    @Override
    public int getCylinders() {
        return 6;
    }

    @Override
    public String start() {
        return "V6 brrrr....";
    }
}
