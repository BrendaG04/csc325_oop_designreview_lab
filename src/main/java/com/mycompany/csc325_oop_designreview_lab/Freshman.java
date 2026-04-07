package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{

    // Number of credits the freshman has completed
    private int credits;

    //Constructor for Freshman.
    public Freshman(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    //Getter for credits.
    public int getCredits() {
        return credits;
    }

    //Setter for credits.
    public void setCredits(int credits) {
        this.credits = credits;
    }

    //toString method for Freshman
    @Override
    public String toString() {
        return "Freshman{name='" + getName() + "', age=" + getAge()
                + ", credits=" + credits + ", gpa=" + getGpa() + "}";
    }
}
