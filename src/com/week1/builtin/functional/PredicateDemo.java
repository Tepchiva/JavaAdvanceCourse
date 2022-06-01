package com.week1.builtin.functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // Predicate<T>
        // same to Function<T,R> but Predicate is return boolean value
        // given string, then check if contain 'a';
        Predicate<String> checkA = name->name.contains("a");
        System.out.format("'Vanda' is contain 'a': %s%n",checkA.test("Vanda"));

        /**
         * We can use Function instead Predicate
         */
        Function<String,Boolean> checkB = name->name.contains("b");
        System.out.format("'Lambda' is contain 'b': %s%n",checkB.apply("Lambda"));
    }
}
