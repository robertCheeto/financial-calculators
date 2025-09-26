package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        // accept the principal, interest rate, and loan length from user
        // display expected monthly payment and total interest paid
        double principal;
        double annualInterestRateDisplay;
        double loanLength;
        Scanner keyboard = new Scanner(System.in);

        // ASKING FOR PRINCIPAL, INTEREST RATE, YEARS
        System.out.println("*** Welcome to the Mortgage Calculator ***\n");
        System.out.print("Please enter the principal amount: ");
        principal = keyboard.nextDouble();
        System.out.print("Please enter the interest rate: ");
        annualInterestRateDisplay = keyboard.nextDouble();
        double annualInterestRateCalc = (annualInterestRateDisplay / 100.0);
        System.out.print("Please enter the loan length in years: ");
        loanLength = keyboard.nextDouble();

        System.out.println("\n*** Calculating loan details... ***\n");
        double numMonthlyPayments = (12 * loanLength);
        double interestRate = (annualInterestRateCalc / 12);
        double monthlyPayment = principal * ((interestRate * Math.pow(1 + interestRate, numMonthlyPayments)) / (Math.pow(1 + interestRate, numMonthlyPayments) - 1));
        double totalInterest = (monthlyPayment * numMonthlyPayments) - principal;

        System.out.printf("A loan with a principal balance of $%.2f at an interest rate of %.4f%% for %.0f years ", principal, annualInterestRateDisplay, loanLength);
        System.out.printf("would have a monthly payment of $%.2f with a total interest payment of $%.2f.", monthlyPayment, totalInterest);

    }
}
