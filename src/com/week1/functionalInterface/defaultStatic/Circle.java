package com.week1.functionalInterface.defaultStatic;

public class Circle implements Area{

    @Override
    public double getArea() {
        return 12;
    }

    @Override
    public String type() {
        return "This is string method.";
    }

    @Override
    public void clean() {
        System.out.println("This clean method that have been override.");
    }
}
