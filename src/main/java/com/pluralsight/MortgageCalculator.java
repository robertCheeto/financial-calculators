package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        // accept the principal, interest rate, and loan length from user
        // display expected monthly payment and total interest paid
        double principal = 0;
        double annualInterestRate = 0.07625;
        double loanLength = 0;
        double numMonthlyPayments = (12 * loanLength);
        double interestRate = (annualInterestRate / 12);
        double monthlyPayment = principal * ((interestRate * Math.pow(1 + interestRate, numMonthlyPayments)) / (Math.pow(1 + interestRate, numMonthlyPayments) - 1));
        double totalInterest = (monthlyPayment * numMonthlyPayments) - principal;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("*** Welcome to the Mortgage Calculator ***\n");
        System.out.print("Please enter the principal amount: ");
        principal = keyboard.nextDouble();
        System.out.println(principal);
        // System.out.print("Please enter the interest rate: \n");
        // annualInterestRate = keyboard.nextDouble();
        // TO-DO - ALLOW THE USER TO INPUT THEIR OWN INTEREST RATE
        System.out.print("Please enter the loan length in years: ");
        loanLength = keyboard.nextDouble();
        System.out.println(loanLength);

        System.out.println("\nCalculating loan details...\n");

    }
}
