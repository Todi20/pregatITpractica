package Sesiunea3.modul1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Integer> grades;


    public Student(int id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }
    public void addGrades(int grade){
        grades.add(grade);
    }

}