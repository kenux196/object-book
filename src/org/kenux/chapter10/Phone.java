package org.kenux.chapter10;


import org.kenux.common.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Phone extends AbstractPhone {

    private final Money amount;
    private final Duration seconds;

    public Phone(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
