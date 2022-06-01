package com.week1.functionalInterface.defaultStatic;

public class DefaultMethodDemoApp {
    public static void main(String[] args){
        /**
         * Circle
         */
        Area area = new Circle();
        System.out.println(area.getArea());
        System.out.println(area.type());
        area.clean();

        /**
         * Triangle
         * Call default method of inter
         */
        Area triangle = new Triangle();
        triangle.clean();

        /**
         * Calling static method
         */
        Area.myTestStatic();
    }
}
