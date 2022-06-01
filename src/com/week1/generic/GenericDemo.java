package com.week1.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Chiva");
        list.add("Phanat");
        list.add("Phanut");

        for (String i : list) {
            System.out.format("Name: %s%n",i);
        }
    }
}
