package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{

    //Number of credits the senior has completed
    private int credits;

    //Minimum credits required to be a Senior
    private static final int MIN_CREDITS = 85;

    //Constructor for Senior.
    //Enforces the minimum credit requirement
    //If the credits provided are below 85, they are set to 85 automatically.
    public Senior(String name, int age, int credits) {
        super(name, age);

        //enforce minimum of 85 credits for Senior
        if (credits < MIN_CREDITS) {
            System.out.println("Seniors must have at least 85 credits");
            this.credits = MIN_CREDITS;
        } else {
            this.credits = credits;
        }
    }

    //Getter for credits. returns number of credits the senior has completed.
    public int getCredits() {
        return credits;
    }

    //Seter for credits. Enforces the 85-credit minimum.
    public void setCredits(int credits) {
        if (credits < MIN_CREDITS) {
            System.out.println("Seniors must have at least 85 credits.");
            this.credits = MIN_CREDITS;
        } else {
            this.credits = credits;
        }
    }

    //toString method for Senior. Includes name, age, credits, and GPA.
    @Override
    public String toString() {
        return "Senior{name='" + getName() + "', age=" + getAge()
                + ", credits=" + credits + ", gpa=" + getGpa() + "}";
    }
}
