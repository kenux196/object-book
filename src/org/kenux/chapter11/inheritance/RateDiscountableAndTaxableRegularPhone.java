package org.kenux.chapter11.inheritance;

import org.kenux.common.Money;

import java.time.Duration;

public class RateDiscountableAndTaxableRegularPhone extends RateDisCountableRegularPhone {

    private double taxRate;

    public RateDiscountableAndTaxableRegularPhone(Money amount, Duration seconds, Money discountAmount,
                                                  double taxRate) {
        super(amount, seconds, discountAmount);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return super.afterCalculated(fee).plus(fee.times(taxRate));
    }
}
