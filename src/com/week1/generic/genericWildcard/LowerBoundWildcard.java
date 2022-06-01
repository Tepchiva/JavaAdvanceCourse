package com.week1.generic.genericWildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcard {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        addInteger(list);
        System.out.format("List integer: %s%n",list);

        // we can use Number type, becuase it's parent of interger
        List<Number> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(34);
        addInteger(numbers);
        System.out.format("List numbers: %s%n",numbers);


        // List.of() is immutable, so we can't add or modify
        List<Integer> list1 = List.of(12,34);
        //list1.add(23);
        System.out.format("List integer: %s%n",list1);
        //  addInteger(list1); // error runtime
    }

    public static void addInteger(List<? super Integer> number) {
        number.add(10);
    }
}
