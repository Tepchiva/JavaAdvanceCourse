package com.week1.generic.genericWildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * upper bounded wildcard restricts the unknown type to be a specific type or a subtype of that type
 * and is represented using the extends keyword.
 */
public class UpperBoundWildcard {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,35,67);
        int result1 = (int) sum(list);
        System.out.format("List integer: %s%n",result1);

        List<Long> list2 = List.of(23l,3l,67l);
        long result2 = (long) sum(list2);
        System.out.format("List long: %s%n",result2);

        List<?> list3 = List.of(43d,20,23f,398l);
        double result3 = sum((List<? extends Number>) list3);
        System.out.format("List of wildcard: %s%n",result3);

        /*
            Will compile-time error
            List<?> list4 = List.of(43d,20,23f,398l,"string");
            double result4 = sum((List<? extends Number>) list4);
         */
    }

    public static double sum(List<? extends Number> numbers) {
        // we cann't add element into list
        // numbers.add(23);

        double total = 0;
        for (Number number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }
}


