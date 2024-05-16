package com.itheima.interFace;

import java.util.ArrayList;

public class ClassManager {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentOperator studentOperator = new StudentOperatorImpl1();

    public ClassManager() {
        students.add(new Student("pigasso","女",99));
        students.add(new Student("pi","男",100));
        students.add(new Student("ga","女",60));
        students.add(new Student("sso","男",59));
    }

    public void PrintInfo(){
        studentOperator.PrintAllInfo(students);
    }

    public void PrintScore(){
        studentOperator.PrintAverageScore(students);
    }
}
