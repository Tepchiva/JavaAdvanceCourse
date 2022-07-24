package com.week1.generic.genericBoundType;

import com.week1.generic.GenericType;

import java.util.ArrayList;
import java.util.List;

// Generic Class Example
public class NaturalNumber<T extends Number> {

    private List<T> numbers;

    public NaturalNumber(List<T> numbers) {
        this.numbers = numbers;
    }

    // Generic method
    public <U> double sumNumberList(GenericType<U> genericType) {
        System.out.format("this is value of parameter generic type: %s%n",genericType.getValue());
        return this.numbers.stream().mapToDouble(x -> x.doubleValue()).reduce(0,(left, right) -> left+right);
    }

    public static void main(String[] args){
        List<Long> numbers = List.of((long)1234,(long)234,(long)3455);
        NaturalNumber<Long> number =  new NaturalNumber<>(numbers);
        GenericType<String> genericType = new GenericType<>();
        genericType.setValue("this value i passed as Generic Type");
        System.out.format("total value of number: %s%n",(long)number.<String>sumNumberList(genericType));


        List<Float> floatNumbers = List.of((float)34.78, (float)343.9, (float)56.4);
        NaturalNumber<Float> naturalNumberFloat = new NaturalNumber<>(floatNumbers);
        GenericType<Double> genericTypeDouble = new GenericType<>();
        genericTypeDouble.setValue(234.89);
        // naturalNumberFloat.<Float>sumNumberList(genericTypeDouble)  // eill error, correct type is Double not Float
        float resultFloatSum = (float)naturalNumberFloat.sumNumberList(genericTypeDouble);
        System.out.format("total value of number: %s%n",resultFloatSum);
    }
}