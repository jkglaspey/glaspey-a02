/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the
    starting temperature. The program should prompt for the type of conversion and then perform the conversion.

    Create method to convert from either F --> C or C --> F
    int convert(int temp, char c)
        if c == 'F' or 'f'
            return (temp - 32) * 5 / 9
        else if c == 'C' or 'c'
            return (temp * 9 / 5) + 32
        else return 0

    Create method to read unit from user
        char readUnit()
            return either F or C

    Create method to print to enter temp and return value
        int enterTemp(char c)
              String unit
              if(c == 'F' or 'f') unit = "Fahrenheit"
              else unit = "Celsius"
              print Enter amount of 'unit'
              return amount

     Create method to print output
        void printResults(int temp, char c)
            if c == Fahrenheit print "The temperature in Fahrenheit is temp"
            else if c == Celsius print "The temperature in Celsius is temp"
            else print "The value could not be converted"

 */

import java.util.Scanner;

public class Solution18 {

    //declare class scanner
    private static final Scanner in = new Scanner(System.in);

    //declare public Strings for Fahrenheit and Celsius
    public static final String FAHRENHEIT = "Fahrenheit";
    public static final String CELSIUS = "Celsius";

    //declare fail case String
    public static final String FAIL = "fail";

    //convert from one unit to another
    public static int convert(int temp, String s) {
        //convert F to C
        if(s.equals(CELSIUS)) return ( (temp - 32) * 5 / 9 );

        //convert C to F
        else if(s.equals(FAHRENHEIT)) return ( (temp * 9 / 5) + 32 );

        //fail case
        else return 0;
    }

    //read in unit from user
    public static String readUnit() {
        //prompt for unit of temperature
        System.out.printf("""
               Press 'C' to convert from Fahrenheit to Celsius.
               Press 'F' to convert from Celsius to Fahrenheit.
               Your choice:%s"""," ");
        String grabAll = in.nextLine();

        //user input Celsius
        if(grabAll.charAt(0) == 'C' || grabAll.charAt(0) == 'c' ) return CELSIUS;

        //user input Fahrenheit
        else if(grabAll.charAt(0) == 'F' || grabAll.charAt(0) == 'f' ) return FAHRENHEIT;

        //fail case
        else return FAIL;
    }

    //gather temperature from user using the correct unit
    public static int readTemp(String unit) {
        //create string to print opposite of unit
        String invert;
        if(unit.equals(FAHRENHEIT)) invert = CELSIUS;
        else if(unit.equals(CELSIUS)) invert = FAHRENHEIT;
        else invert = FAIL;

        //if unit is valid, ask user to input temperature
        if( !unit.equals(FAIL) ) {
            System.out.printf("Please enter your temperature in %s: ",invert);
            return in.nextInt();
        }
        //fail case
        else return 0;
    }

    public static void printResults(int temp, String unit) {
        //fail case
        if(unit.equals(FAIL)) System.out.print("You didn't enter a correct measurement.");

        else System.out.printf("The temperature in %s is %d.",unit,temp);
    }

    public static void main(String[] args) {
        //declare variables
        int temp;
        String unit;

        //gather data
        unit = readUnit();
        temp = readTemp(unit);

        //convert temp
        temp = convert(temp,unit);

        //print output
        printResults(temp,unit);
    }
}
