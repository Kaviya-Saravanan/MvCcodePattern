package com.wrkspot.mvccodepattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvCcodePatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvCcodePatternApplication.class, args);


        StudentModelViewController model=Database();
        StudentView view=new StudentView();
        StudentController controller=new StudentController(model,view);
        controller.Update();
        controller.setStudentName("Mary");
        System.out.println("Updated");
        controller.Update();

    }
    public static StudentModelViewController Database(){
        StudentModelViewController student=new StudentModelViewController();
        student.setName("Alisa");
        student.setAge(21);
        student.setAverage(30.3);
        student.setGrade('C');
        return student;
    }

}



