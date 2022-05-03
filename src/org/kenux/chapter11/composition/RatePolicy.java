package org.kenux.chapter11.composition;

import org.kenux.common.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
