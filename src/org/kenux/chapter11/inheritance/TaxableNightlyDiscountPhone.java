package org.kenux.chapter11.inheritance;

import org.kenux.common.Money;

import java.time.Duration;

public class TaxableNightlyDiscountPhone extends NightlyDiscountPhone {

    private double taxRate;

    public TaxableNightlyDiscountPhone(Money nightlyAmount,
                                       Money regularAmount,
                                       Duration seconds, double taxRate) {
        super(nightlyAmount, regularAmount, seconds);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {  // 추상(훅) 메서드 이용.
        return fee.plus(fee.times(taxRate));
    }
}
