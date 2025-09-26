package com.pluralsight;

import java.util.Scanner;

public class AnnuityCalculator {
    public static void main(String[] args) {
        // determines the present value of an ordinary annuity
        // accept a monthly payout, expected interest rate, and years to pay out
        // display the present value of that annuity
        double principal;
        double annualInterestRateDisplay;
        double annualInterestRateCalculate;
        double years;
        Scanner keyboard = new Scanner(System.in);

        // ASKING FOR PRINCIPAL, INTEREST RATE, YEARS
        System.out.println("*** Welcome to the Annuity Calculator ***");
        System.out.print("Please enter the present value of the annuity: ");
        principal = keyboard.nextDouble();

        System.out.print("Please enter the expected interest rate: ");
        annualInterestRateDisplay = keyboard.nextDouble();
        annualInterestRateCalculate = (annualInterestRateDisplay / 100.0);

        System.out.print("Please enter the amount of years the annuity will pay out for: ");
        years = keyboard.nextDouble();
        double months = years / 12.0;

        // annuityValue formula needs updated to show correct results
        // TO-DO: show monthly payout amount, fix annuityValue formula, add sout/souf display messages for the end result to the user
        double annuityValue = principal * ((1 - Math.pow(1 + annualInterestRateCalculate, (-months)) / annualInterestRateCalculate));
        System.out.printf("The present value of the annuity is $%.2f", annuityValue);

    }
}
