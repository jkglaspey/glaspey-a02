/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Create a program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight
    in pounds. The program should prompt the user for weight and height.


    Create method to prompt user for weight
        int weight()
            loop
                print "What is your weight in pounds"
                if input is int, return int
                else
                    string dump = nextLine
                    continue

    Create method to prompt user for height
        int height()
            loop
                print "What is your height in inches"
                if input is int, return int
                else
                    string dump = nextLine
                    continue

     Create method to calculate BMI
        double BMI(int weight, int height)
            return ( (double) weight / (height * height )) * 703

     Create method to determine final output
        void print(double bmi)
            print "Your bmi is 'bmi'"
            if bmi > 25 print "You are overweight. You should see your doctor"
            else if bmi < 18.5 print "You are underweight. You should see your doctor"
            else print "You are within the ideal weight range."

     Main method:
        Create int's for weight and height
        weight = weight()
        height = height()
        Calculate BMI
            double bmi = bmi(weight, height)
        if
 */

import java.util.Scanner;

public class Solution19 {

    //declare class Scanner
    private static final Scanner in = new Scanner(System.in);

    //read weight from user (numerical)
    public static int readWeight() {
        //loop to ensure input is numerical
        while(true) {
            System.out.print("Please enter your weight in pounds: ");

            //if data is numerical, terminate loop
            if(in.hasNextInt() ) return in.nextInt();

            //fail condition
            else {
                //removes incorrect response
                String dump = in.nextLine();
                System.out.print("Make sure your data is numerical!\n");
            }
        }
    }

    //read height from user (numerical)
    public static int readHeight() {
        //loop to ensure input is numerical
        while(true) {
            System.out.print("Please enter your height in inches: ");

            //if data is numerical, terminate loop
            if(in.hasNextInt() ) return in.nextInt();

                //fail condition
            else {
                //removes incorrect response
                String dump = in.nextLine();
                System.out.print("Make sure your data is numerical!\n");
            }
        }
    }

    //calculate BMI
    public static double calcBMI(int weight, int height) {
        return ( (double) weight / (height * height )) * 703;
    }

    //print results (conditional)
    public static void printBMI(double bmi) {
        //first statement
        System.out.printf("Your BMI is %.1f%n",bmi);

        //determine second statement by comparing bmi to the healthy range

        //overweight
        if(bmi > 25) System.out.print("You are overweight. You should see your doctor.");
        //underweight
        else if(bmi < 18.5) System.out.print("You are underweight. You should see your doctor.");
        //healthy
        else System.out.print("You are within the ideal weight range.");
    }

    public static void main(String[] args) {
        //declare variables
        int weight;
        int height;
        double bmi;

        //assign values
        weight = readWeight();
        height = readHeight();

        //calculate BMI
        bmi = calcBMI(weight, height);

        //print results
        printBMI(bmi);
    }
}
