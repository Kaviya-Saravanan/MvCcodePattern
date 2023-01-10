package com.wrkspot.mvccodepattern;
class StaticVariable {
    int rollno;
    String name;
    static String college="ABC";

    public StaticVariable(int rollno,String name) {
        rollno = rollno;
        name=name;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
    public class VariableTest{
        public void main(String[] args) {
            StaticVariable s1=new StaticVariable(123,"John");
            System.out.println(s1);
            s1.display();
        }
    }
}
