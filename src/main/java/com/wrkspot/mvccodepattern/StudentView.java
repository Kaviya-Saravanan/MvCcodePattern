package com.wrkspot.mvccodepattern;

public class StudentView {
    public void studentDetails(String name, int age, double average, char grade) {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Average:" + average);
        System.out.println("grade:" + grade);

    }
}
