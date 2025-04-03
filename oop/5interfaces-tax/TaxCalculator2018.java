package com.tax;

public class TaxCalculator2018 extends AbstractTaxCalculator {
  private double taxableIncome;

  public TaxCalculator2018(double taxableIncome) {
    this.taxableIncome = taxableIncome;
  }

  @Override
  public double calculateTax() {
    return taxableIncome * 0.3;
  }
}

// For Main2.java
// package com.tax;

// public class TaxCalculator2018 extends AbstractTaxCalculator {
//     private double income;
//     private double expenses;

//     public TaxCalculator2018(double income, double expenses) {
//         this.income = income;
//         this.expenses = expenses;
//     }

//     @Override
//     public double calculateTax() {
//         double taxableIncome = getTaxabaleIncome(income, expenses);
//         return taxableIncome * 0.3;
//     }
// }

