package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Student student1 = new Student ("Carl Poppa", 4.0, 1);
    Student student2 = new Student ("Tim Joe", 2.5, 3);
    Student student3 = new Student ("Sam Smith", 3.6, 2);

    System.out.println("The top three students are: " + student1.displayName() + ", " + student3.displayName() + ", and " + student2.displayName());
    }
}
