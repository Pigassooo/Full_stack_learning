package com.itheima.interFace;

import java.util.ArrayList;

public class StudentOperatorImpl1 implements StudentOperator{

    @Override
    public void PrintAllInfo(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student x = students.get(i);
            System.out.println(x.getName());
            System.out.println(x.getGender());
            System.out.println(x.getScore());
        }
    }

    @Override
    public void PrintAverageScore(ArrayList<Student> students) {
        double allscore = 0;
        for (int i = 0; i < students.size(); i++) {
            Student x = students.get(i);
            allscore += x.getScore();
        }
        System.out.println((allscore / students.size()));
    }
}
