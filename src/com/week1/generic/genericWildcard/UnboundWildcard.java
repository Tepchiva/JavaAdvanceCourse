package com.week1.generic.genericWildcard;

import java.util.ArrayList;
import java.util.List;

public class UnboundWildcard {
    public static void main(String[] args) {
        List<String> strings = List.of("chiva","phanat","phanut");
        printDataList(strings);

        List<Integer> integers = List.of(23,123);
        printDataList(integers);

        // not apply unboud geneeric wildcard,
        // printDataObject(integers);
        // printDataObject(strings);
    }

    public static void printDataList(List<?> list) {
        for (int i = 0;i < list.size(); i++) {
            System.out.format("Element: %s%n",list.get(i));
        }
    }

    // not apply unboud geneeric wildcard,
    public static void printDataObject(List<Object> list) {
        for (int i = 0;i < list.size(); i++) {
            System.out.format("Element: %s%n",list.get(i));
        }
    }
}
