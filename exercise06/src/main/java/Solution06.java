/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Write an application that prompts for your age and retirement age, then calculates how long it will take to retire and in what specific year
    Create method int getYear()
        year = get calendar year
     return year
    currentYear = getYear()
    new Scanner to read user input
    scan:
        age = user's age
        retirementAge = user's age of retirement
    print:
        How many years until retirement = retirementAge - age
        What year it is = currentYear
        What year can the user retire = currentYear + retirementAge - age
*/

import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {

    /*
        Class method that returns the current year via the system time
     */
    public static int getCalendarYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public static void main(String[] args) {
        //variable declarations
        int age;
        int retirementAge;
        Scanner in = new Scanner(System.in);
        int year = getCalendarYear();

        //read data
        System.out.print("What is your current age? ");
        age = in.nextInt();
        System.out.print("At what age would you like to retire? ");
        retirementAge = in.nextInt();

        //answer
        System.out.printf("You have %d years left until you can retire.\n" +
                "It's %d, you can retire in %d",retirementAge - age, year, year + (retirementAge - age));
    }
}