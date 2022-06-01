package com.week1.functionalInterface.defaultStatic;

public class Triangle implements Area{
    @Override
    public double getArea() {
        return 14;
    }

    @Override
    public String type() {
        return "This is string method.";
    }
}
