/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet.
    Then display the area in both square feet and square meters.

    Create method that converts area to meters:
        public static double feetToMeters(int feet)
            double conversion factor = 0.09290304
            double temporary value = feet * conversion factor
            temporary value += 0.0005 (so printf statement rounds to 3 decimal points)
            return temporary value

    Create method that calculates area given length and width:
        public static int area(int length, int width)
            return length * width

    Main method:
        prompt user for dimensions
            Scanner in = length, width
        calculate area
            int area = area(length, width)
        print area
        convert area to meters
            double area (in meters) = feetToMeters(int area)
        print area
*/


import java.util.Scanner;

public class Solution07 {

    public static double feetToMeters(int feet) {
        double conversionFactor = 0.09290304;
        return feet * conversionFactor + 0.0005;
    }

    public static int area(int length, int width) {
        return length * width;
    }
    public static void main(String[] args) {
        //declare variables
        double areaMeters;
        int length;
        int width;
        int areaFeet;
        Scanner in = new Scanner(System.in);

        //gather data
        System.out.print("What is the length of the room in feet: ");
        length = in.nextInt();
        System.out.print("What is the width of the room in feet: ");
        width = in.nextInt();

        //calculate area in feet
        areaFeet = area(length, width);

        //print area in feet
        System.out.printf("""
                You entered dimensions of %d by %d feet.
                The area is:
                %d square feet."""
                ,length,width,areaFeet);

        //convert area to meters
        areaMeters = feetToMeters(areaFeet);

        //print out area in meters
        System.out.println();
        System.out.printf("%.3f square meters.",areaMeters);
    }
}
