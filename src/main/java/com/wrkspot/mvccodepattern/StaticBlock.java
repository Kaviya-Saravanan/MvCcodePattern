package com.wrkspot.mvccodepattern;

public class StaticBlock {
    static int num1=10;
    static int num2;
    static {
        System.out.println("Static block");
        num2=num2*num1;
    }

    public static void main(String[] args) {
        System.out.println("Value of num2:"+num2);
    }
}
