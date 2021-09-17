/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not
    different, then exit the program. Otherwise, display the largest number of the three.


    Create method to gather the 3 numbers
        void readNumbers(int list[])
            loop(i = 0 -> 2)
                #i = nextInt()

     Create method to verify the numbers are different
        boolean isUnique(int[] list)
            loop(i = 0 -> list.length)
                loop(j = 0 -> list.length)
                  if(list[i] == list[j])
                        return false

      Create method to determine the largest number in the list
         int findLargestNumber(int[] list)
            int max = Minimum integer
                loop(i = 0 -> list.length)
                    if(max < list[i])
                        max = list[i]
            return max

       Create method to print the result
          void printResult(int max)
            print result

       Main method:
            declare maximum value variable and array of 3 values
            int max, int[3] list

 */

import java.util.Scanner;

public class Solution22 {

    //declare class Scanner
    private static final Scanner in = new Scanner(System.in);

    //declare array length
    private static final int SIZE = 3;

    //read in 3 numbers
    public static void readNumbers(int[] list) {
        //loop for the length of the list
        for(int i = 0; i < SIZE; i++) {
            System.out.printf("Enter number #%d: ",i + 1);
            list[i] = in.nextInt();
        }
    }

    //determine if all values are unique
    public static boolean isUnique(int[] list) {
        //loop
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                //duplicate case test
                if(i == j) continue;

                //check number uniqueness
                if(list[i] == list[j]) return false;
            }
        }
        return true;
    }

    //determine largest value in array
    public static int findLargestValue(int[] list) {
        //declare max temp variable
        int max = Integer.MIN_VALUE;

        //loop
        for(int i = 0; i < SIZE; i++) {
            //override the max if the next number is larger
            if(max < list[i]) max = list[i];
        }
        return max;
    }

    //print result
    public static void printResult(int max) {
        System.out.printf("The largest value is %d.",max);
    }

    public static void main(String[] args) {
        //declare variables
        int[] list = new int[SIZE];
        int max;

        //get data
        readNumbers(list);

        //conditional logic
        //fail case
        if(!isUnique(list)) System.out.print("These numbers are not unique!");

        //determine largest number
        else {
            max = findLargestValue(list);
            printResult(max);
        }
    }
}
