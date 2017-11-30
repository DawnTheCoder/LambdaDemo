package com.dawn.service;

import com.dawn.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Chenpengfei
 * Created on 2017/11/29
 */

//这个函数用JDK5级别（基本实现）的语言来实现：一组学生成绩的筛选（成绩小于40的）
public class Origin {

    private static List<Student> studentList = new ArrayList<Student>();    //新建一个学生集合
    static{
        //初始化一些学生
        Student s1 = new Student("进草",20,33);
        Student s2 = new Student("方远",19,69);
        Student s3 = new Student("宏伟",17,78);
        Student s4 = new Student("610",17,27);
        Student s5 = new Student("淇琳",27,20);
        Student s6 = new Student("鲤鱼",18,41);

        //装入集合中
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
    }

    //筛选的主要方法，筛选出成绩少于40的
    public static void filter(){
        for (Student student : studentList) {
            if(student.getScore()<40){
                System.out.println(student.getName()+"成绩只有："+ student.getScore());
            }
        }

    }

    public static void main(String[] args) {
        filter();
    }

}
