package com.week1.functionalInterface;

/**
 * use Annotation @FunctionInterface for constrain
 * interface have only one abract method
 */
@FunctionalInterface
public interface AddNumber {
    final int LENGTH = 10;
    public Integer add(int n);

    default void print() {
        System.out.println("This is add number inaterface.");
    }
}
