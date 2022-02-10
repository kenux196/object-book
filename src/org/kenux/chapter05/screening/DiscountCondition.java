package org.kenux.chapter05.screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}