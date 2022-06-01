package com.week1.generic.genericMethod;

import com.week1.generic.GenericType;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    public static <T> boolean isEqual(GenericType<T> t1,GenericType<T> t2) {
        return t1.getValue().equals(t2.getValue());
    }

    public static <T> List<T> combine(List<T> list1, List<T> list2) {
        List<T> temp = new ArrayList<>();
        temp.addAll(list1);
        temp.addAll(list2);
        return temp;
    }

    public static void main(String[] args) {
        GenericType<Integer> t1 = new GenericType<Integer>();
        t1.setValue(5);

        GenericType<Integer> t2 = new GenericType<>();
        t2.setValue(5);

        boolean result = GenericMethod.<Integer>isEqual(t1,t2);
        System.out.format("Result: %s%n",result);

        // demo with list collection
        List<String> name1 = new ArrayList<>();
        name1.add("chiva");

        List<String> name2 = new ArrayList<String>();
        name2.add("Phanat");
        name2.add("Phanut");

        // List<String> combineName = GenericMethod.combine(name1,name2);
        List<String> combineName = combine(name1,name2);
        System.out.format("Combine list: %s%n",combineName);
    }
}
