package org.kenux.chapter10;

import org.kenux.common.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPhone {
    private final List<Call> calls = new ArrayList<>();

    public Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }
        return result;
    }

    protected abstract Money calculateCallFee(Call call);
}
