package org.kenux.chapter02.screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
