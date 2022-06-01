package com.week1.generic;

public class NonGenericType {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public static void main(String[] args) {
        NonGenericType nonGenericType = new NonGenericType();
        nonGenericType.setValue("Tep Chiva");
        //nonGenericType.setValue(10); error casting type

        String name = (String) nonGenericType.getValue();
        System.out.println(name);
    }
}
