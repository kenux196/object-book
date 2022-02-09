package org.kenux.chapter05.screening;

public class SequenceCondition {

    private int sequence;

    public boolean isSatisfiedBy(Screening screening) {
        return sequence == screening.getSequence();
    }
}