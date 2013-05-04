package org.bill;

public class BiggerIntegerComparison implements Comparison {
    @Override
    public boolean isFirstBetterThanSecond(Integer first, Integer second) {
        return first > second;
    }

    @Override
    public Integer worstValue() {
        return Integer.MIN_VALUE;
    }
}
