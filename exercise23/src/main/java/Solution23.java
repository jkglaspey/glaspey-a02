/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Create a program that walks the user through troubleshooting issues with a car.

    Create a method that walks the user through a troubleshooting process for car issues
        void troubleshootCar()
            create if-else statements that correspond to the PlantUML diagram

    Main method:
        troubleshootCar()
 */

import java.util.Scanner;

public class Solution23 {

    //create class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create yes / no class variables
    private static final String YES = "y";

    public static void fixCar() {
        //variable for storing response
        String answer;

        //instructions
        System.out.print("Is your car broken? Answer 'y' or 'n' to the following questions: \n\n");

        System.out.print("Is the car silent when you turn the key? ");
        answer = in.nextLine();

        if(answer.equals(YES)) {
            System.out.print("Are the battery terminals corroded? ");
            answer = in.nextLine();
            if(answer.equals(YES)) {
                System.out.print("Clean terminals and try again.");
            }
            else {
                System.out.print("Replace cables and try again.");
            }
        }
        else {
            System.out.print("Does the car make a slicking noise ");
            answer = in.nextLine();
            if(answer.equals(YES)) {
                System.out.print("Replace the battery.");
            }
            else {
                System.out.print("Does the car crank up but fail to start? ");
                answer = in.nextLine();
                if(answer.equals(YES)) {
                    System.out.print("Check spark plug connection.");
                }
                else {
                    System.out.print("Does the engine start and then die? ");
                    answer = in.nextLine();
                    if(answer.equals(YES)) {
                        System.out.print("Does your car have fuel injection? ");
                        answer = in.nextLine();
                        if(answer.equals(YES)) {
                            System.out.print("Get it in for service");
                        }
                        else {
                            System.out.print("Check to ensure the choke is opening and closing");
                        }
                    }
                    else {
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        //call method
        fixCar();
    }
}
