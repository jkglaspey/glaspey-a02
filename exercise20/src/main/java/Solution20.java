/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Create a tax calculator that handles multiple states and multiple counties within each state. The program prompts
    the user for the order amount and the state where the order will be shipped.


    Create method to read a state (and possibly a county) and return a tax amount
        double calcTax(int amount)
            double tax = $0.00
            print "What state do you live in?"
            if string is Wisconsin
                print "What county do you live in?"
                if string is Eau Claire
                    tax = amount * 0.055
                if string is Dunn
                    tax = amount * 0.054
                if string is neither
                    tax = amount * 0.05
            if string is Illinois
                tax = amount * 0.08
            return tax

    Create method to print results
        void printResults(int amount, double tax)
            if tax > 0
                print "The tax is $'tax'"
            print "The total is 'tax + amount'

    Create method to read default amount
        int readAmount
            print "What is the order amount?"
            return nextInt

     Main method:
        create variables for int amount and double tax
        amount = readAmount
        tax = calcTax
        printResults
 */

import java.util.Scanner;

public class Solution20 {

    //create class variable
    private static final Scanner in = new Scanner(System.in);

    //create Global variables
    public static final String WISCONSIN = "Wisconsin";
    public static final String ILLINOIS = "Illinois";
    public static final String EAU_CLAIRE = "Eau Claire";
    public static final String DUNN = "Dunn";

    //reads default amount
    public static int readAmount() {
        System.out.print("What is the order amount? ");
        int value = in.nextInt();
        String dump = in.nextLine();
        return value;
    }

    //returns tax amount based off state and county
    public static double calcTax(int amount) {
        //default tax value
        double tax = 0.00;

        //prompt for state
        System.out.print("What state do you live in? ");
        String state = in.nextLine();

        //determine if state is Wisconsin, Illinois, or neither
        //Wisconsin
        if(state.equalsIgnoreCase(WISCONSIN)) {

            //prompt for county
            System.out.print("What county do you live in? ");
            String county = in.nextLine();

            //determine if county is Eau Claire, Dunn, or neither
            //Eau Claire
            if(county.equalsIgnoreCase(EAU_CLAIRE)) tax = amount * 0.055;

            //Dunn
            else if(county.equalsIgnoreCase(DUNN)) tax = amount * 0.054;

            //neither
            else tax = amount * 0.05;
        }
        //Illinois
        else if(state.equalsIgnoreCase(ILLINOIS)) tax = amount * 0.08;

        //neither
        else return tax;

        //round to the nearest cent
        tax += 0.004;
        tax = Math.round(tax * 100.0) / 100.0;

        return tax;
    }

    //print results
    public static void printResults(int amount, double tax) {
        //create string to include in statement if tax > 0
        String append = "";
        if(tax > 0) append = "The tax is $" + tax + "\n";

        //print
        System.out.printf("%sThe total is $%.2f",append,amount + tax);
    }

    public static void main(String[] args) {
        //declare variables
        int amount;
        double tax;

        //gather data
        amount = readAmount();
        tax = calcTax(amount);

        //print results
        printResults(amount, tax);
    }
}
