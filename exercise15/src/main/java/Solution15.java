/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Create a simple program that validates user login credentials. The program must prompt the user for a username and
    password. The program should compare the password given by the user to a known password. If the password matches,
    the program should display "Welcome!" If it doesn't match, the program should display "I don’t know you."


    Create method to determine if the string matches a known password
        boolean compare(String password, String s)
            return s.equals(password)

    Main method:
        declare variable for storing password (string)
        create random "known" password
        compare known to string
        if(the strings are equal)
            "Welcome!"
        else "I don't know you"
*/

import java.util.Scanner;

public class Solution15 {

    public static boolean compare(String known, String password) {
        return known.equals(password);
    }

    public static void main(String[] args) {
        //declare variables
        Scanner in = new Scanner(System.in);
        String password;
        String known = "abc$123";

        //gather data
        System.out.print("Enter the password: ");
        password = in.nextLine();

        //determine and print results
        if(compare(known,password))     System.out.print("Welcome!");
        else System.out.print("I don't know you.");
    }

}
