package org.bill;

import java.util.Set;

public class BiggestNumberFinder {
    public Integer find(Set<Integer> numbers) {
        Integer champion = Integer.MIN_VALUE;
        for(Integer challenger : numbers){
            if (challenger > champion){
                champion = challenger;
            }
        }
        return champion;
    }
}
