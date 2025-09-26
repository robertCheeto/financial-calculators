package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        // accept the principal, interest rate, and loan length from user
        // display expected monthly payment and total interest paid
        double principal;
        double annualInterestRate = 0.07625;
        double loanLength;
        double numMonthlyPayments = (12 * loanLength);
        double interestRate = (annualInterestRate / 12);
        double monthlyPayment = principal * ((interestRate * Math.pow(1 + interestRate, numMonthlyPayments)) / (Math.pow(1 + interestRate, numMonthlyPayments) - 1));
        double totalInterest = (monthlyPayment * numMonthlyPayments) - principal;
    }
}
