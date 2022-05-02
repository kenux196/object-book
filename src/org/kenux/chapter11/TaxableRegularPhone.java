package org.kenux.chapter11;

import org.kenux.common.Money;

import java.time.Duration;

public class TaxableRegularPhone extends RegularPhone {

    private double taxRate;

    public TaxableRegularPhone(Money amount, Duration seconds, double taxRate) {
        super(amount, seconds);
        this.taxRate = taxRate;
    }

//    @Override
//    public Money calculateFee() {
//        Money fee = super.calculateFee(); // super 사용으로 결합도 상승.
//        return fee.plus(fee.times(taxRate));
//    }

    @Override
    protected Money afterCalculated(Money fee) {  // 추상(훅) 메서드 이용.
        return fee.plus(fee.times(taxRate));
    }
}
