package org.kenux.chapter11.inheritance;


import org.kenux.common.Money;

import java.time.Duration;

public class RegularPhone extends Phone {

    private final Money amount;
    private final Duration seconds;

    public RegularPhone(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
