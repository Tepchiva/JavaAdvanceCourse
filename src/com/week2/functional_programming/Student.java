package com.week2.functional_programming;

public class Student {
    private int id;
    private String name;
    private String gender;
    private int age;

    public Student(int id,String name,String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public  String getGender(){
        return gender;
    }

    @Override
    public String toString(){
        return String.format("Student [id: %s, name: %s, gender: %s,age: %s]",this.id,this.name,this.gender,this.age);
    }
}
