package com.pluralsight;

import java.util.Scanner;

public class CertificateOfDeposit {
    public static void main(String[] args) {
        // accept the deposit amount, interest rate, and years from user
        // display the future value and total interest earned
        double principal;
        double annualInterestRateDisplay;
        double years;
        int daysPerYear = 365;
        Scanner keyboard = new Scanner (System.in);


        System.out.println("*** Welcome to the CD Calculator ***\n");
        System.out.print("Please enter the principal amount: ");
        principal = keyboard.nextDouble();

        System.out.print("Please enter the interest rate: ");
        annualInterestRateDisplay = keyboard.nextDouble();
        double annualInterestRateCalc = (annualInterestRateDisplay / 100.0);

        System.out.print("Please enter the loan length in years: ");
        years = keyboard.nextDouble();

        double totalNumberOfDays = daysPerYear * years;
        double futureValue = principal * (Math.pow(1 + (annualInterestRateCalc / daysPerYear), totalNumberOfDays));
        double totalInterest = futureValue - principal;

        System.out.printf("\nIf you deposit $%.2f at an interest rate of %.3f%% for %.0f years...", principal, annualInterestRateDisplay, years);
        System.out.printf("\nYou your final balance would be $%.2f with an interest amount of $%.2f.", futureValue, totalInterest);
    }
}
