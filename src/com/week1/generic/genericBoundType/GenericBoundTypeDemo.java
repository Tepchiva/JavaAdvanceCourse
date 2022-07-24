package com.week1.generic.genericBoundType;

import java.util.ArrayList;
import java.util.List;

public class GenericBoundTypeDemo {

    // generic bound type
    public static <T extends Number> double sum(List<T> list) {
        double total = 0;
        for (T num : list) {
            //total+=(double)num; will error because it's primative type
            total += num.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add((int)2.56);
        number.add(3);
        int result = (int) GenericBoundTypeDemo.<Integer>sum(number);
        System.out.format("Sum list of int type: %s%n", result);

        List<Double> number2 = new ArrayList<>();
        number2.add(2.5);
        number2.add(2.5);
        number2.add(.5);
        double result2 = sum(number2);
        System.out.format("Sum list of double type %s%n", result2);

        List<Long> number3= List.of(1L,2l,5l);
//        long reuslt3 = (long) GenericBoundTypeDemo.sum(number3);
        long reuslt3 = (long) GenericBoundTypeDemo.<Long>sum(number3);
        System.out.format("Sum list of long type %s%n", reuslt3);

        List<String> name = List.of("chiva","dara");
        // error type
        //System.out.format("Sum string: %s%n",GenericBoundTypeDemo.sum(name));
    }
}
