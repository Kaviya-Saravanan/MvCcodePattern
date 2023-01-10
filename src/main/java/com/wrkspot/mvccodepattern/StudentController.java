package com.wrkspot.mvccodepattern;

public class StudentController {
    private StudentModelViewController model;
    private StudentView view;

    public StudentController(StudentModelViewController model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public StudentModelViewController getModel() {
        return model;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentAge(int age) {
        model.setAge(age);
    }

    public int getStudentAge() {
        return model.getAge();
    }

    public void setStudentAverage(double average) {
        model.setAverage(average);
    }

    public double getStudentAverage() {
        return model.getAverage();
    }

    public void setStudentGrade(char grade) {
        model.setGrade(grade);
    }

    public char getStudentGrade() {
        return model.getGrade();
    }

    public void Update() {
        view.studentDetails(model.getName(), model.getAge(), model.getAverage(), model.getGrade());

    }
}
