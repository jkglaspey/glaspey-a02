/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Write a program that asks the user for their age and compare it to the legal driving age of sixteen. If the user is
    sixteen or older, then the program should display "You are old enough to legally drive." If the user is under
    sixteen, the program should display "You are not old enough to legally drive."


    Create method to return if the user is 16 or older
        boolean checkAge(int age)
            return age >= 16

     Main method:
        declare variable for storing user age
        use method to determine if age is 16 or older
            use ternary operator for check, then print either "yes" or "no"
 */

import java.util.Scanner;

public class Solution16 {

    //declare static Scanner
    public static final Scanner in = new Scanner(System.in);

    //check age
    public static boolean checkAge(int age) {
        return age >= 16;
    }

    public static void main(String[] args) {
        //declare variables
        int age;

        //gather information
        System.out.print("What is your age? ");
        age = in.nextInt();

        //use ternary statement to print result
        System.out.printf("%s",(checkAge(age)?"You are old enough to legally drive":"You are not old enough to " +
                "legally drive."));
    }
}
