package com.sample.ioc.factories.injection_point;

import com.sample.ioc.Engine;
import jakarta.inject.Singleton;

@Singleton
@InjCylinders(value = 7, value2 = 9)
public class InjV7Engine implements Engine {

    @Override
    public int getCylinders() {
        return 7;
    }

    @Override
    public String start() {
        return "V7 brrrr....phphph";
    }
}
