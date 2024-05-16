package com.itheima.interFace;

import java.util.ArrayList;

public class StudentOperatorImpl2 implements StudentOperator {
    @Override
    public void PrintAllInfo(ArrayList<Student> students) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < students.size(); i++) {
            Student x = students.get(i);
            System.out.println(x.getName());
            System.out.println(x.getGender());
            System.out.println(x.getScore());
            if (count1 == '男') {count1++;};
            if (count2 == '女'){count2++;};
        }

        System.out.println("男:" + count1);
        System.out.println("女:" + count2);
    }

    @Override
    public void PrintAverageScore(ArrayList<Student> students) {
        double allscore = 0;
        for (int i = 0; i < students.size(); i++) {
            Student x = students.get(i);
            allscore += x.getScore();
        }
        System.out.println((allscore / students.size()) - 1);
    }
}
