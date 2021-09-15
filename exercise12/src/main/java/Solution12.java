/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Create a program that computes simple interest. Prompt for the principal amount, the rate as a percentage, and the
    time, and display the amount accrued (principal + interest).


    Create method to calculate simple interest following A = P(1 + rt)
        double calculateSI(double principal, double rate, int time)
            double value = principal(1 + ( rate / 100 ) * time)
            Rounding:
                value += 0.004
                value = Math round function
            return value

     Main method:
        Create variables to store principal amount, rate of interest, time, and final value
            principal, rate, time, total
        Scan data
        Calculate total using calculateSI
        Print results
 */

import java.util.Scanner;

public class Solution12 {

    public static double calculateSI(double principal, double rate, int time) {
        //calculate value
        double value = principal * (1 + (rate / 100) * time);

        //round value
        value += 0.004;
        value = Math.round(value * 100.00) / 100.00;

        return value;
    }

    public static void main(String[] args) {
        //declare variables
        Scanner in = new Scanner(System.in);
        double principal;
        double rate;
        int time;
        double total;

        //gather data
        System.out.print("Enter the principal: ");
        principal = in.nextDouble();
        System.out.print("Enter the rate of interest: ");
        rate = in.nextDouble();
        System.out.print("Enter the number of years: ");
        time = in.nextInt();

        //calculate results
        total = calculateSI(principal,rate,time);

        //print results
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f",time,rate,total);
    }
}
