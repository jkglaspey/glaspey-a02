import java.util.Scanner;

public class Solution08 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 2 Solution
     *  Copyright 2021 Joshua Glaspey
     */

/*
    Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the
    number of slices per pizza. Ensure that the number of pieces comes out even. Display the number of pieces
    of pizza each person should get. If there are leftovers, show the number of leftover pieces.

    Create method to count total slices
        int totalSlices(int pizzas, int slices)
            return pizzas * slices

    Create method that returns how many slices each person gets
        int individualSlices(int slices, int people)
            return slices / people

    Create method that returns remainder of pizza slices
        int remainingSlices(int slices, int people)
            return slices % people

    Main method:
        Read how many people there are, how many pizzas, and how many slices each pizza has
            int people, pizzas, slices
        Calculate total slices
            int totalSlices = totalSlices(pizzas,slices)
        Calculate remaining slices (if any)
            int remainingSlices = remainingSlices(int slices, int people)
        print remainingSlices

*/


    public static int totalSlices(int pizzas, int slices) {
        return pizzas * slices;
    }

    public static int individualSlices(int slices, int people) {
        return slices / people;
    }

    public static int remainingSlices(int slices, int people) {
        return slices % people;
    }

    public static void main(String[] args) {
        //declare variables
        Scanner in = new Scanner(System.in);
        int people;
        int pizzas;
        int slices;
        int totalSlices;
        int individualSlices;
        int remainingSlices;

        //gather data
        System.out.print("How many people? ");
        people = in.nextInt();
        System.out.print("How many pizzas do you have? ");
        pizzas = in.nextInt();
        System.out.print("How many slices per pizza? ");
        slices = in.nextInt();

        //perform calculations
        totalSlices = totalSlices(pizzas,slices);
        individualSlices = individualSlices(totalSlices,people);
        remainingSlices = remainingSlices(totalSlices,people);

        //print results
        System.out.printf("""
                %d people with %d pizzas (%d slices)
                Each person gets %d pieces of pizza.
                There are %d leftover pieces.
                """,people,pizzas,totalSlices,individualSlices,remainingSlices);
    }
}
