package org.kenux.chapter11.inheritance;

import org.kenux.common.Money;

import java.time.Duration;

public class RateDisCountableRegularPhone extends RegularPhone {

    private Money discountAmount;

    public RateDisCountableRegularPhone(Money amount, Duration seconds, Money discountAmount) {
        super(amount, seconds);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return super.afterCalculated(fee);
    }
}
