package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Welcome to the Financial Calculator ***");

        displayCalculatorMenu();
        int menuChoice = keyboard.nextInt();

        if (menuChoice == 1) {
            MortgageCalculator();
        }
        else if (menuChoice == 2) {
            CertificateofDeposit();
        }
//        else if (menuChoice == 3) {
//            AnnuityCalculator();
//        }
        else {
            System.out.println("That is not an option!");
        }

        // write code to get principal, interest rate, and years for loan?
        // need to pass those variables into other methods() and have those methods return values
        //

    } // *** MAIN *** MAIN *** MAIN *** MAIN *** MAIN *** MAIN *** MAIN *** MAIN *** MAIN *** MAIN *** MAIN *** MAIN *** MAIN ***

    public static void displayCalculatorMenu() {
        System.out.println("Choose A Calculator:");
        System.out.println("1) Mortgage Calculator");
        System.out.println("2) Certificate of Deposit (CD) Calculator");
        //System.out.println("3) Annuity Calculator");
        System.out.print("Please enter your choice here: ");

    }

    public static void MortgageCalculator() {
        // accept the principal, interest rate, and loan length from user
        // display expected monthly payment and total interest paid
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

        System.out.printf("A loan with a principal balance of $%.2f at an interest rate of %.4f%% for %.0f years ", principal, annualInterestRateDisplay, loanLength);
        System.out.printf("would have a monthly payment of $%.2f with a total interest payment of $%.2f.", monthlyPayment, totalInterest);

    }

    public static void CertificateofDeposit() {
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
