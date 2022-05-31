package com.example.sdkTest;

import test_java.Student;

public class test {
    public static void main(String[] args) {
        System.out.println("测试使用！！！！");
        Student student =new Student("xiaoming",12,89);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getScore());
    }
}
