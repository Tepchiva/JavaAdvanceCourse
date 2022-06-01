package com.week1.functionalInterface;

public class FunctionalInterfaceDemoApp {
    public static void main(String[] args) {

        /**
         * Init instance method
         */
        AddNumber addNumber = new MyAddThree();
        System.out.format("Add 3 to 5 number: %s%n",addNumber.add(5));

        /**
         * Init by anonymouse
         */
        AddNumber addNumber1 = new AddNumber() {
            @Override
            public Integer add(int n) {
                return n + 5;
            }
        };
        System.out.format("Add 5 to 6 number: %s%n",addNumber1.add(6));

        /**
         * Using lambda expression for Functional Interface
         */
        AddNumber addNumber2 = n -> n+4;
        System.out.format("Add 4 to 8 number: %s%n",addNumber2.add(8));
    }
}
