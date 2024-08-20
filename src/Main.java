/*
Option #1: Calculate Average Withholding

Create a program that will calculate the weekly average tax withholding for a customer given the following
weekly income guidelines:

    Income less than $500: tax rate 10%
    Incomes greater than/equal to $500 and less than $1500: tax rate 15%
    Incomes greater than/equal to $1500 and less than $2500: tax rate 20%
    Incomes greater than/equal to $2500: tax rate 30%

Compile and submit your pseudocode, source code, and screenshots of the application executing the application,
the results and GIT repository in a single document.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner object to capture user input
        Scanner userInput = new Scanner(System.in);
        // prompt for input
        System.out.println("Enter your income (whole number): ");
        System.out.print("> ");
        // store user input in int variable 'income'
        int income = userInput.nextInt();

        // define constants for tax rates
        double lowTaxRate = 0.1;
        double midTaxRate = 0.15;
        double highTaxRate = 0.2;
        double veryHighTaxRate = 0.3;

        // define constants for income thresholds
        int lowThreshold = 500;
        int midThreshold = 1500;
        int highThreshold = 2500;

        // declaring double variables for storing results of calculations
        double taxWithholding;
        double usedTaxRate;

        // if/else clauses to determine tax withholding
        if (income < lowThreshold) {
            // calculating tax withholding based on determined tax rate and user provided 'income'
            taxWithholding = income * lowTaxRate;
            usedTaxRate = lowTaxRate;
        } else if (income < midThreshold) {
            taxWithholding = income * midTaxRate;
            usedTaxRate = midTaxRate;
        } else if (income < highThreshold) {
            taxWithholding = income * highTaxRate;
            usedTaxRate = highTaxRate;
        } else if (income > highThreshold) {
            taxWithholding = income * veryHighTaxRate;
            usedTaxRate = veryHighTaxRate;
        } else {
            // else statement to handle inputs outside of bounds
            taxWithholding = 0;
            usedTaxRate = 0;
        }

        // display results
        System.out.println("Your weekly tax withholding is: ");
        System.out.println("$" + taxWithholding);
        System.out.println("Based on an income of: $" + income);
        System.out.println("And a tax rate of: " + usedTaxRate + "%");
    }
}
