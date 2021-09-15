/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Write a program that converts currency. Specifically, convert euros to U.S. dollars. Prompt for the amount of money
    in euros you have, and prompt for the current exchange rate of the euro. Print out the new amount in U.S. dollars.

    Create method to convert euros to U.S. dollars
        double convert(double currency, double exchangeRate)
            value = currency * exchangeRate
            value = round(value) to 10th's place, rounding up
            return value

    Main method:
        Create variables for storing current balance and exchange rates
            balance, exchangeRate
        Calculate U.S. currency
            convert(balance,exchangeRate)
        print
 */

import java.util.Scanner;

public class Solution11 {

    public static double convert(double currency, double exchangeRate) {
        //perform calculation
        double value = currency * exchangeRate;

        //round up
        value += 0.004;
        value = Math.round(value * 100.00) / 100.00;
        return value;
    }

    public static void main(String[] args) {
        //declare variables
        Scanner in = new Scanner(System.in);
        double balance;
        double exchangeRate;
        double convertedBalance;

        //gather data
        System.out.print("How many euros are you exchanging? ");
        balance = in.nextDouble();
        System.out.print("What is the exchange rate? ");
        exchangeRate = in.nextDouble();

        //perform calculations
        convertedBalance = convert(balance, exchangeRate);

        //print results
        System.out.printf("""
                %f euros at an exchange rate of %f is
                %.2f U.S. dollars.
                """,balance,exchangeRate,convertedBalance);
    }
}
