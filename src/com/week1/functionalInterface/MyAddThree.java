package com.week1.functionalInterface;

public class MyAddThree implements AddNumber {

    @Override
    public Integer add(int n) {
        return n + 3;
    }
}
