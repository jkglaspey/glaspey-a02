/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Create a program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time
    since your last drink. Calculate your blood alcohol content (BAC) using this formula:
    BAC = (A × 5.14 / W × r) − .015 × H


    Create method that calculates the blood alcohol content (BAC)
        double BAC(int weight, int gender, int ounces, int time)
            if(gender == 1) return ounces * 5.14 / weight * 0.73 − .015 * time
            else return ounces * 5.14 / weight * 0.66 − .015 * time

    Create method that returns if the user can drive or not
        boolean canDrive(double BAC)
            return BAC < 0.08

     Create 4 methods that prompt user to input each metric for calculating BAC. Use while loops to prevent
     non-numerical data from being inputted
        int enterWeightFromUser()
            create int "result" to loop until assigned a proper number
                result = 0
            while(result <= 0)
                prompt for weight
                scan weight to String temp
                result = parse temp to int
                if(result > 0) return result
                else print "Try again"
      Repeat for gender, ounces of alcohol, and time since having drank last

      Main method:
        declare variables weight, gender, ounces, and time
        enterWeightFromUser, enterGenderFromUser, enterOuncesFromUser, enterTimeFromUser
        double result = BAC(values)
        if canDrive(BAC) passes
            "It is legal for you to drive"
        else "It is not legal for you to drive"
 */

import java.util.Scanner;

public class Solution17 {

    //public Scanner declaration
    private static final Scanner in = new Scanner(System.in);

    //invalid input String declaration
    private static final String fail = "Please enter a valid input\n";

    //calculate BAC
    public static double calcBAC(int weight, int gender, int ounces, int time) {
        //if male
        if(gender == 1) return ( ounces * 5.14 / weight * 0.73 ) - .015 * time;
        //if female
        else return ( ounces * 5.14 / weight * 0.66 ) - .015 * time;
    }

    public static boolean canDrive(double bac) {
        return (bac < 0.08);
    }

    public static int readWeightFromUser() {
        //looping condition
        boolean loop = true;

        while(loop) {
            System.out.print("What is your weight, in pounds? ");
            String temp = in.nextLine();
            //determine if string is integer
            if( ( temp.charAt(0) >= '0' ) && ( temp.charAt(0) <= '9') && ( Integer.parseInt(temp) > 0 ) ) {
                return Integer.parseInt(temp);
            }
            else System.out.printf("%s",fail);
        }
        return 0;
    }

    public static int readGenderFromUser() {
        //looping condition
        boolean loop = true;

        while(loop) {
            System.out.print("Enter '1' if you are a male and '2' if you are a female: ");
            String temp = in.nextLine();
            //determine if string is integer
            if( ( temp.charAt(0) >= '1' ) && ( temp.charAt(0) <= '2') && ( temp.length() == 1) ) {
                return Integer.parseInt(temp);
            }
            else System.out.printf("%s",fail);
        }
        return 0;
    }

    public static int readOuncesFromUser() {
        //looping condition
        boolean loop = true;

        while(loop) {
            System.out.print("How many ounces of alcohol did you have? ");
            String temp = in.nextLine();
            //determine if string is integer
            if( ( temp.charAt(0) >= '0' ) && ( temp.charAt(0) <= '9') && ( Integer.parseInt(temp) >= 0 )  ) {
                return Integer.parseInt(temp);
            }
            else System.out.printf("%s",fail);
        }
        return 0;
    }

    public static int readTimeFromUser() {
        //looping condition
        boolean loop = true;

        while(loop) {
            System.out.print("How many hours has it been since your last drink? ");
            String temp = in.nextLine();
            //determine if string is integer
            if( ( temp.charAt(0) >= '0' ) && ( temp.charAt(0) <= '9') && ( Integer.parseInt(temp) >= 0 )  ) {
                return Integer.parseInt(temp);
            }
            else System.out.printf("%s",fail);
        }
        return 0;
    }

    public static void main(String[] args) {
        //declare variables
        int weight;
        int gender;
        int ounces;
        int time;
        double bac;

        //gather data
        gender = readGenderFromUser();
        ounces = readOuncesFromUser();
        weight = readWeightFromUser();
        time = readTimeFromUser();

        //calculate data
        bac = calcBAC(weight,gender,ounces,time);

        //print results
        System.out.printf("%nYour B.A.C. is %f%n",bac);
        System.out.printf("%s",(canDrive(bac)) ? "It is legal for you to drive.":"It is not legal for you to drive.");
    }
}
