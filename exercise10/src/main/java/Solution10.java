/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Joshua Glaspey
 */

/*
    Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of
    the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total,
    and then print out the subtotal, tax amount, and total.


    Create method to calculate subtotal of items
        double subtotal(double item1, int count1, double item2, int count2, double item3, int count3)
            return item1 * count1 + item2 * count2 + item3 * count3

    Create method to apply sales tax to total
        double salesTax(double total)
            return total * .055

    Create method to add sales tax to total
        double salesTotal(double total, double salesTax)
            return total + salesTax

    Create method to round sales tax and total
        void roundTaxes(double salesTax, double salesTotal)
            salesTax = math -> round (sales____ * 100.00) / 100.00

    Main method:
        loop 3 times
            read item #i
            read quantity of item #i
        calculate subtotal
            subtotal = subtotal(item1, count1, item2, count2, item3, count3)
        calculate sales tax
            double tax = salesTax(total)
        calculate total with tax
            double total = salesTotal(total,tax)
        round taxed values
            roundTaxes(tax,total)
        print values
 */

import java.util.Scanner;

public class Solution10 {

    public static double subtotal(double item1, int count1, double item2, int count2, double item3, int count3) {
        return item1 * count1 + item2 * count2 + item3 * count3;
    }

    public static double salesTax(double subtotal) {
        double taxRate = .055;
        return subtotal * taxRate;
    }

    public static double salesTotal(double subtotal, double tax) {
        return subtotal + tax;
    }

    public static void round(double tax, double total) {
        tax = Math.round(tax * 100.00) / 100.00;
        total = Math.round(total * 100.00) / 100.00;
    }

    public static void main(String[] args) {
        //declare variables
        Scanner in = new Scanner(System.in);
        double item1;
        double item2;
        double item3;
        int count1;
        int count2;
        int count3;
        double subtotal;
        double tax;
        double total;

        //gather data
        System.out.print("Enter the price of item 1: ");
        item1 = in.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        count1 = in.nextInt();
        System.out.print("Enter the price of item 2: ");
        item2 = in.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        count2 = in.nextInt();
        System.out.print("Enter the price of item 3: ");
        item3 = in.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        count3 = in.nextInt();

        //calculate data
        subtotal = subtotal(item1, count1, item2, count2, item3, count3);
        tax = salesTax(subtotal);
        total = salesTotal(subtotal,tax);
        round(tax,total);

        //print results
        System.out.printf("""
                Subtotal: $%.2f
                Tax: $%.2f
                Total: $%.2f
                """,subtotal,tax,total);
    }

}
