package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Welcome to the Financial Calculator ***");

        displayCalculatorMenu();
        int menuChoice = keyboard.nextInt();

        if (menuChoice == 1) {
            mortgageCalculator();
        }
        else if (menuChoice == 2) {
            certificateOfDeposit();
        }
        else if (menuChoice == 3) {
            annuityCalculator();
        }
        else {
            System.out.println("That is not an option!");
        }
    } // END main()

    public static void displayCalculatorMenu() {
        System.out.println("Choose A Calculator:");
        System.out.println("1) Mortgage Calculator");
        System.out.println("2) Certificate of Deposit (CD) Calculator");
        System.out.println("3) Annuity Calculator");
        System.out.print("Please enter your choice here: ");
    } // END displayCalculatorMenu()

    public static void mortgageCalculator() {
        double principal;
        double annualInterestRateDisplay;
        double loanLength;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\n\n*** Welcome to the Mortgage Calculator ***");
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

        System.out.printf("A loan with a principal balance of $%.2f at an interest rate of %.3f%% for %.0f years...\n******\n", principal, annualInterestRateDisplay, loanLength);
        System.out.printf("Your Monthly Payment would be: $%.2f\nTotal Interest accrued on the payment would be: $%.2f", monthlyPayment, totalInterest);
    } // END mortgageCalculator()

    public static void certificateOfDeposit() {
        double principal;
        double annualInterestRateDisplay;
        double years;
        int daysPerYear = 365;
        Scanner keyboard = new Scanner (System.in);

        System.out.println("\n\n*** Welcome to the CD Calculator ***\n");
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

        System.out.printf("\nIf you deposit $%.2f at an interest rate of %.3f%% for %.0f years...\n******\n", principal, annualInterestRateDisplay, years);
        System.out.printf("Your Final Balance would be: $%.2f\nTotal Interest Earned would be: $%.2f", futureValue, totalInterest);
    } // END certificateOfDeposit()

    public static void annuityCalculator() {
        double principal;
        double annualInterestRateDisplay;
        double annualInterestRateCalculate;
        double years;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\n\n*** Welcome to the Annuity Calculator ***");
        System.out.print("Please enter the monthly payout of the annuity: ");
        principal = keyboard.nextDouble();

        System.out.print("Please enter the expected interest rate: ");
        annualInterestRateDisplay = keyboard.nextDouble();
        annualInterestRateCalculate = (annualInterestRateDisplay / 100.0);

        System.out.print("Please enter the amount of years the annuity will pay out for: ");
        years = keyboard.nextDouble();
        double months = (years * 12.0);

        // annuityValue formula needs updated to show correct results
        double annuityValue = principal * (1 - (Math.pow(1 + annualInterestRateCalculate, (-months))) / annualInterestRateCalculate);
        System.out.printf("The present value of the annuity is: $%.2f", annuityValue);
    } // END annuityCalculator


}
