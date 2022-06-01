package com.week1.functionalInterface.defaultStatic;

public interface Area {
    double getArea();
    String type();

    default void clean() {
        System.out.println("This is clean method.");
    }

    static void myTestStatic() {
        System.out.println("My test static method.");
    }
}
