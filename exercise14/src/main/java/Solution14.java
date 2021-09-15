/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Write a simple program to compute the tax on an order amount. The program should prompt for the order amount and the
    state. If the state is "WI," then the order must be charged 5.5% tax. The program should display the subtotal, tax,
    and total for Wisconsin residents but display just the total for non-residents.


    Create function to apply the "Wisconsin" tax if the user is a resident.
        double calculateTotal(double subtotal, double tax)
            return = subtotal + tax

    Create function to return the Wisconsin tax if the user is a resident (rounded up to the nearest cent)
        double calculateTax(double subtotal)
            double value = subtotal * 0.055
            value = math round function (value + 0.004)
            return value

    Create function to return a boolean value of whether the user is a resident of Wisconsin or not
        boolean resident(String state)
        boolean result = false
            if(state equals "WI") result = true
        return result

    Main method:
        Declare variables for subtotal, total, tax, and state
        total = subtotal
        tax = 0.00
        if(resident is from Wisconsin)
            tax = getTax()
            total = calculateTax(subtotal,tax)
        print total
 */

import java.util.Scanner;

public class Solution14 {

    public static double calculateTotal(double subtotal, double tax) {
        //calculate result
        return subtotal + tax;
    }

    public static double calculateTax(double subtotal) {
        //calculate result
        double value = subtotal * 0.055;

        //round result
        value += 0.004;
        value = Math.round(value * 100.00) / 100.00;
        return value;
    }

    public static boolean resident(String state) {
        return state.equalsIgnoreCase("WI");
    }

    public static void main(String[] args) {
        //declare variables
        Scanner in = new Scanner(System.in);
        double subtotal;
        String state;
        double tax = 0.00;
        double total;

        //read data
        System.out.print("What is the order amount? ");
        subtotal = in.nextDouble();
        String trash = in.nextLine(); //garbage collection
        System.out.print("What is the state? ");
        state = in.nextLine();

        //perform calculations
        total = subtotal;
        if(resident(state)) {
            tax = calculateTax(subtotal);
            total = calculateTotal(subtotal,tax);
        }

        //print results
        System.out.printf("""
                The subtotal is $%.2f.
                The total tax is $%.2f.
                The total is $%.2f.
                """,subtotal,tax,total);
    }
}
