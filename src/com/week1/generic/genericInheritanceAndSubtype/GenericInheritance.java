package com.week1.generic.genericInheritanceAndSubtype;

import java.util.ArrayList;
import java.util.List;

// parent
class  GenericParentType<T> {

}
// subtype
class  GenericSubType<T> extends GenericParentType<T>{

}

public class GenericInheritance {
    public static void main(String[] args) {
        //we have class B inherit from class A, so we can assign instance of B to A
        String name = "chiva";
        Object obj = new Object();
        obj = name;
        System.out.format("Object instance: %s%n",obj);

        GenericParentType<String> genericString = new GenericParentType<>();
        GenericParentType<Object> genericObj = new GenericParentType<>();
        // we can't assign generic instance to other
        // genericObj = genericString; will error

        //but we can assign into Object instance
        obj = genericObj;
        System.out.format("Generic object: %s%n",obj);
        obj = genericString;
        System.out.format("Generic string: %s%n",obj);

        // we can assign generic instance to other if it's generic subtype of that generic
        GenericParentType<Object> genericParentType = new GenericParentType<>();
        GenericSubType<Object> genericSubType = new GenericSubType<>();
        genericParentType = genericSubType;


        // example with generic List
        List<Integer> list = new ArrayList<>();
    }
}
