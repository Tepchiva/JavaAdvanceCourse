package com.week1.builtin.functional;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args){

        // Function<T,R>

        // T: Input type
        // R: Return type

        // convert string to integer (integer is number of character in string)
        // string name = "eam tola";
        // number = 8

        /**
         * Use lambda expression
         */
        Function<String,Integer> countCharacter1 = param->param.length();
        System.out.format("Character number of '%s' is: %s%n","Dara",countCharacter1.apply("Dara"));

        /**
         * Use anonymouse
         */
        Function<String,Integer> countCharacter2 = new Function<String,Integer>() {
            @Override
            public Integer apply(String s) {
                return  s.length();
            }
        };
        System.out.format("Character number of '%s' is: %s%n","Chiva",countCharacter2.apply("Chiva"));

        /**
         * Use lambda expression
         */
        Function<Integer,Long> factorial = f -> {
            long total = 1;
            for (int i=f;i>0;i--) {
                total *= i;
            }
            return total;
        };

        System.out.format("Factorial of '%s' is: %s%n",5,factorial.apply(5));
    }
}
