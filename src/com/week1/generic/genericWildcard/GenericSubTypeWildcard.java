package com.week1.generic.genericWildcard;

import java.util.ArrayList;
import java.util.List;

public class GenericSubTypeWildcard {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<? extends Integer> list2 = new ArrayList<>();
        List<? extends Integer> list3 = list1;
        list3 = list2;

        List<String> strings = new ArrayList<>();
        //list3 = strings; we can't addign becuase strings not inherit from
    }
}
