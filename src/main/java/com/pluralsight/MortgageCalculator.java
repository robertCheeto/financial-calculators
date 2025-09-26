package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        // accept the principal, interest rate, and loan length from user
        // display expected monthly payment and total interest paid
        double principal;
        double annualInterestRate;
        double loanLength;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("*** Welcome to the Mortgage Calculator ***\n");
        System.out.print("Please enter the principal amount: ");
        principal = keyboard.nextDouble();
         System.out.print("Please enter the interest rate: \n");
         annualInterestRate = keyboard.nextDouble();
        // TO-DO - CREATE VARIABLE FOR INTEREST RATE FOR CALCULATION AND KEEP USER INPUT VARIABLE FOR DISPLAY MESSAGES
        System.out.print("Please enter the loan length in years: ");
        loanLength = keyboard.nextDouble();

        System.out.println("\nCalculating loan details...\n");
        double numMonthlyPayments = (12 * loanLength);
        double interestRate = (annualInterestRate / 12);
        double monthlyPayment = principal * ((interestRate * Math.pow(1 + interestRate, numMonthlyPayments)) / (Math.pow(1 + interestRate, numMonthlyPayments) - 1));
        double totalInterest = (monthlyPayment * numMonthlyPayments) - principal;

        System.out.printf("A loan with a principal balance of $%.2f at an interest rate of %f%% for %.0f years ", principal, annualInterestRate, loanLength);
        System.out.printf("would have a monthly payment of $%.2f with a total interest payment of $%.2f", monthlyPayment, totalInterest);

    }
}
