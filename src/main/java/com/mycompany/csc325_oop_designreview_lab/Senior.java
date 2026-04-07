package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{

    //Number of credits the senior has completed
    private int credits;

    //Minimum credits required to be a Senior
    private static final int MIN_CREDITS = 85;

    //Constructor for Senior.
    public Senior(String name, int age, int credits) {
        super(name, age);
    }

    //Getter for credits.
    public int getCredits() {
        return credits;
    }

    //Seter for credits
    public void setCredits(int credits) {
        if (credits < MIN_CREDITS) {
            System.out.println("Seniors must have at least 85 credits.");
            this.credits = MIN_CREDITS;
        } else {
            this.credits = credits;
        }
    }
}
