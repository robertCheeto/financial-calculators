package com.pluralsight;

public class CertificateOfDeposit {
    public static void main(String[] args) {
        // accept the deposit amount, interest rate, and years from user
        // display the future value and total interest earned
        double principal;
        double annualInterestRateDisplay;
        double years;
        int daysPerYear = 365;


        System.out.println("*** Welcome to the CD Calculator ***\n");
        System.out.print("Please enter the principal amount: ");
        principal = keyboard.nextDouble();
        System.out.print("Please enter the interest rate: ");
        annualInterestRateDisplay = keyboard.nextDouble();
        double annualInterestRateCalc = (annualInterestRateDisplay / 100.0);
        System.out.print("Please enter the loan length in years: ");
        years = keyboard.nextDouble();

        double totalNumberDays = daysPerYear * years;
        double futureValue = principal * (1 + Math.pow((annualInterestRateCalc / daysPerYear), daysPerYear * years));

        System.out.println();
    }
}
