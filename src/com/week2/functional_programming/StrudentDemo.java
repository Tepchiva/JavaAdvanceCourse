package com.week2.functional_programming;

/*
    This demo show how imperative and declaritive style coding.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StrudentDemo {
    private static List<Student> students = List.of(
            new Student(1,"chanta","F",12),
            new Student(2,"borey","M",13),
            new Student(3,"boramey","F",15),
            new Student(4,"votha","F",11),
            new Student(5,"virak","M",12)
    );
    public static void main(String[] args) {
        /*
            Select 3 first of female student
         */
        // imperative style
        System.out.println("============================Select 3 first of femle student============================");
        System.out.println("==============Imperative style==============");
        List<Student> studentList = getStudents(students);
        for (Student student: studentList) {
            System.out.println(student);
        }

        // declaritive style
        System.out.println("==============Declaritive style==============");
        List<Student> studentList1 = getStudentsDeclaritive(students);
        //        for (Student student: studentList1) {
        //            System.out.println(student);
        //        }
        // or use comsumer with method reference
        studentList1.forEach(System.out::println);


        /*
            Group student by age
         */
        System.out.println("============================Group student by age============================");
        // imperative style
        System.out.println("==============Imperative style==============");
        Map<Integer,List<Student>> studentGroup = groupStudentsByAge(students);
        // for loop map, we use Entry<K,V>
        for (Map.Entry<Integer,List<Student>> studentEntry : studentGroup.entrySet()){
            System.out.println(studentEntry.getKey()+" => "+studentEntry.getValue());
        }

        // declaritive style
        System.out.println("==============Declaritive style==============");
        Map<Integer,List<Student>> studentGroup2 = groupStudentsByAgeDeclaritive(students);
        //        for (Map.Entry<Integer,List<Student>> studentEntry : studentGroup2.entrySet()) {
        //            System.out.println(studentEntry.getKey()+" -> "+studentEntry.getValue());
        //        }
        // or use comsumer with method reference
        studentGroup2.forEach((age, students) -> {
            System.out.println(age+" -> "+students);
        });
    }

    /*
        Select first 3 of female student
     */
    // imperative style
    public static List<Student> getStudents(List<Student> students) {
        List<Student> list = new ArrayList<>();
        int count = 0;
        int limit = 3;
        for (Student student: students){
            if (student.getGender().equals("F")){
                list.add(student);
                count++;
            }
            if (count==limit) break;
        }
        return list;
    }

    // declaritive
    public static List<Student> getStudentsDeclaritive(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGender().equals("F"))
                .limit(3)
                .collect(Collectors.toList());
    }

    /*
        Group student by age
     */
    // imperative style
     public static Map<Integer,List<Student>> groupStudentsByAge(List<Student> students) {
         Map<Integer, List<Student>> mapStudent = new HashMap<>();
         for (Student student: students) {
             Integer age = student.getAge();
             List<Student> studentGroupByAge = mapStudent.get(age);
             if (studentGroupByAge == null) {
                 studentGroupByAge = new ArrayList<>();
                 studentGroupByAge.add(student);
                 mapStudent.put(age,studentGroupByAge);
             }
             else {
                 studentGroupByAge.add(student);
             }
         }
         return mapStudent;
     }
    // declaritive
    public static Map<Integer,List<Student>> groupStudentsByAgeDeclaritive(List<Student> students) {
        return students.stream().collect(Collectors.groupingBy(Student::getAge));
        //        Map<Integer, List<Student>> collect = students.stream().collect(Collectors.groupingBy(Student::getAge));
        //        return collect;
    }
}
