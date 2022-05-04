package org.kenux.chapter11.composition;

import org.kenux.common.Money;

import java.math.BigDecimal;
import java.time.Duration;

public class CompositionTest {

    public static void main(String[] args) {

        Phone phone = new Phone(new TaxablePolicy(0.05,
                new RegularPolicy(
                        new Money(BigDecimal.valueOf(100)), Duration.ofSeconds(3))));

    }
}
