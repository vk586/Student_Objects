package com.company;

public class Student {

    private String sName;
    private double GPA;
    private int ranking;

    public Student(String sn, double gpa, int r)
    {
        sName = sn;
        gpa = GPA;
        ranking = r;
    }
    public String displayName()
    {
        return sName;
    }
    public Double displayGPA()
    {
        return GPA;
    }
    public int Rank() {
        return ranking;
    }
}
