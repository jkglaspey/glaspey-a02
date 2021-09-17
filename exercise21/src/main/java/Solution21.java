/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display the
    corresponding calendar month, with 1 being January and 12 being December. For any value outside that range, display
    an appropriate error message.


    Create method to get month number
        int readMonth()
            loop
                print "Please enter the number of the month: "
                if int > 12 or int < 1
                    print "Try again"
                else return int

     Create method to print resultant month
        void printMonth(int i)
            String month
            Switch: 1 - month = January
                        ...
                        ...
                    12 - month = December
             print "The month is 'month'"

      Main method:
        Create int for storing month number
        printMonth(month number)
 */

import java.util.Scanner;

public class Solution21 {

    //create class Scanner
    private static final Scanner in = new Scanner(System.in);

    //read month number from user
    public static int readMonth() {
        //month variable
        int month;

        //loop to retry for false cases
        while(true) {
            System.out.print("Please enter the number of the month. ");
            month = in.nextInt();

            //check for valid case
            if(month <= 12 && month >= 1) return month;

            //fail case
            System.out.print("Please enter a valid month number (1-12)\n");
        }
    }

    //print resultant month
    public static void printMonth(int i) {
        //month variable
        String month = switch (i) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> throw new IllegalStateException("Unexpected value: " + i);
        };

        //determine the correct month
        System.out.printf("The name of the month is %s.",month);
    }

    public static void main(String[] args) {
        //declare month number variable
        int month;

        //gather data
        month = readMonth();

        //print results
        printMonth(month);
    }
}
