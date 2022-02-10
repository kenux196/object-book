package org.kenux.chapter05.screening;

public class SequenceCondition implements DiscountCondition {

    private int sequence;

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return sequence == screening.getSequence();
    }
}