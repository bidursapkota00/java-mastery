package com.tax;

public class Main {
    public static void main(String[] args) {
        double income = 70000;
        double expenses = 20000;

        TaxCalculator calculator = new TaxCalculator2018(income, expenses);

        TaxReport report = new TaxReport(calculator);
        report.show(calculator);
    }
}
