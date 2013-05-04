package org.bill;

import java.util.Set;

public class BiggestNumberFinder {
    private Comparison comparison;

    public BiggestNumberFinder(Comparison comparison) {
        this.comparison = comparison;
    }

    public Integer find(Set<Integer> numbers) {
        Integer champion = comparison.worstValue();
        for(Integer challenger : numbers){
            if (comparison.isFirstBetterThanSecond(challenger, champion)){
                champion = challenger;
            }
        }
        return champion;
    }
}
