package com.week1.generic;

public class GenericType<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        //demo with string type
        GenericType<String> name = new GenericType<String>();
        name.setValue("Chiva");
        // name.setValue(10); error type
        String strName = name.getValue();
        System.out.format("String: %s%n",strName);

        //demo with integer type
        GenericType<Integer> intNum = new GenericType<>(); // we can use opt type
        intNum.setValue(34);
        System.out.format("Number: %s%n",intNum.getValue());

        //demo with object type
        GenericType<Object> obj = new GenericType<>();
        obj.setValue("Car");
        System.out.format("Object: %s%n",(String)obj.getValue());
        //or we can
        GenericType obj1 = new GenericType<>();
        obj1.setValue("Motobyte");
        System.out.format("Object: %s%n",(String)obj1.getValue());
    }
}
