/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Write a program to compute the value of an investment compounded over time. The program should ask for the starting
    amount, the number of years to invest, the interest rate, and the number of periods per year to compound.


    Create method to calculate compound interest following A = P(1 + r/n)^(n*t)
        double calculateCI(double principal, double rate, int interval, int years)
            double value = principal * Math:raise power function( (1 + ( rate / 100 ) / interval)),interval * years)
            Rounding:
                value += 0.004
                value = Math round function
            return value

     Main method:
        Create variables to store principal amount, rate of interest, rate of compounding, time (in years), and final value
            principal, rate, interval, years, total
        Scan data
        Calculate total using calculateCI
        Print results
 */

import java.util.Scanner;

public class Solution13 {

    public static double calculateCI(double principal, double rate, int interval, int time) {
        //calculate value
        double value = principal * Math.pow( (1 + (rate / 100.0) / interval ), (double)interval * time);

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
        int interval;
        int years;
        double total;

        //gather data
        System.out.print("What is the principal amount? ");
        principal = in.nextDouble();
        System.out.print("What is the rate? ");
        rate = in.nextDouble();
        System.out.print("What is the number of years? ");
        years = in.nextInt();
        System.out.print("What is the number of times per year the interest is compounded? ");
        interval = in.nextInt();

        //calculate results
        total = calculateCI(principal,rate,interval,years);

        //print results
        System.out.printf("""
                $%.2f invested at %.1f%% for %d years compounded %d times per year is $%.2f
                """,principal,rate,years,interval,total);
    }
}
