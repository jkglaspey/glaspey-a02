/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one
    gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.


    Create method to calculate surface area of the ceiling being painted
        int calculateArea(int length, int width)
            return width * height

    Create method to return total gallons of needed paint
        int totalGallons(int area)
            int gallon = 350
            int totalGallons = area / gallon
            int remainingGallons = area % gallon
            if remainingGallons > 0 return totalGallons + 1
            otherwise return totalGallons

     Main method:
        gather data from user
            length, width
        calculate area
            area = calculateArea(length, width)
        calculate total gallons
            gallons = totalGallons(area)
        print gallons
 */

import java.util.Scanner;

public class Solution09 {

    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static int totalGallons(int area) {
        //conversion rate
        int gallon = 350;

        int totalGallons = area / gallon;

        //determine if there is a remainder
        int remainingGallons = area % gallon;
        if (remainingGallons > 0) {
            return totalGallons + 1;
        } else return totalGallons;
    }

    public static void main(String[] args) {
        //declare variables
        Scanner in = new Scanner(System.in);
        int length;
        int width;
        int area;
        int gallons;

        //gather data
        System.out.print("Enter length of ceiling in feet: ");
        length = in.nextInt();
        System.out.print("Enter width of ceiling in feet: ");
        width = in.nextInt();

        //calculate values
        area = calculateArea(length,width);
        gallons = totalGallons(area);

        //print results
        System.out.printf("""
                You will need to purchase %d gallons of paint to cover %d square feet.
                """,gallons,area);
    }
}
