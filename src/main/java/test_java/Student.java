package test_java;

import test_java.Person;

public class Student extends Person {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

}
