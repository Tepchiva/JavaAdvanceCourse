package com.week1.generic.genericBoundType;

// generic class
public class Box<T> {
    private T type;

    public void setType(T type) {
        this.type = type;
    }

    public T getType() {
        return  this.type;
    }


    // generic bound type
    public <U extends Number> void inspect(U boundType) {
        System.out.format("T: %s%n",type.getClass().getName());
        System.out.format("U: %s%n",boundType.getClass().getName());
    }

    public static void main(String[] arg) {
        Box<String> box = new Box<>();
        box.setType("hello this is any string for testing.");
        box.inspect(new Integer(100));

        System.out.format("Display value: %s%n",box.getType());
    }
}
