package com.tax;

public abstract class AbstractTaxCalculator
  implements TaxCalculator {

  protected double getTaxabaleIncome(double income, double expenses) {
    return income - expenses;
  }
}
