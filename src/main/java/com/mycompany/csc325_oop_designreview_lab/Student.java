/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors

    // Private field for the student's address (required by Human's abstract methods)
    private String address;

    //Humans constructor requires (String name, short age)
    //super(name, age) here. The int age parameter is cast to short to match.
    public Student(String name, int age) {
        super(name, (short) age);
    }
    //Implement abstract method from Human
    @Override
    public String getAddress() {
        return address;
    }
    //Implement abstract method from Human.
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

	// ToDo 3: Add a field for GPA and create a setter and a getter
    //Field for GPA
    private double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

	// ToDo 4: Add comments to your code


    //part of task 9 - it will return a formatted string with the students name, age, and GPA.
    @Override
    public String toString() {
        return "Student{name='" + getName() + "', age=" + getAge() + ", gpa=" + gpa + "}";
    }
}
