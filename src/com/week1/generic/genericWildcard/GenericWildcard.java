package com.week1.generic.genericWildcard;

import com.week1.generic.GenericType;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic wildcard It represents an unknown type (?)
 * Wildcard can be used in a variety of situations such as the type
 *
 * Can do
 * -parameter
 * -field
 * -local variable
 *
 * Cannot do
 * -invoking a generic method
 * -Instantiating a generic instance of class
 *
 */
public class GenericWildcard {
    public static void main(String[] args) {
        /**
         * Can do example
         */
        //use as local variable
        List<?>  list = List.of("chiva","phanat",23);
        System.out.format("Local variable: %s%n",list);

        //use as return type
        List<?> list2 = getList();
        System.out.format("Return type: %s%n",list2);

        //use as parameter
        System.out.format("Parameter:%n");
        display(getList());

        /**
         * Cannot do example
         */
        //invoking a generic method
        //list.add("dara");

        //Instantiating a generic instance of class
        //GenericType<?> genericType = new GenericType<?>();
    }


    //use as return type
    public static List<?> getList() {
        return List.of(12,34,"chiva",24);
    }

    //use as parameter
    public static void display(List<?> list) {
        for (int i =0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}


