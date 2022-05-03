package org.kenux.chapter11.composition;

import org.kenux.common.Money;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Phone {

    private RatePolicy ratePolicy; // interface 에 의존. 합성.
    private final List<Call> calls = new ArrayList<>();

    public Phone(RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    public Money calculateFee() {
        return ratePolicy.calculateFee(this);
    }

    public List<Call> getCalls() {
        return Collections.unmodifiableList(calls);
    }
}
