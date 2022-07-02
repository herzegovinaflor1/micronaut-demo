package com.sample.ioc.generic;

public interface GenericEngine <T extends CylinderProvider> {

    default int getCylinders() {
        return getCylinderProvider().getCylinders();
    }

    default String start() {
        return "Starting " + getCylinderProvider().getClass().getSimpleName();
    }

    T getCylinderProvider();
}
