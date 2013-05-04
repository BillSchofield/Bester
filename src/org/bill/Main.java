package org.bill;

import java.util.Set;

import static com.google.common.collect.Sets.newHashSet;

public class Main {

    public static void main(String[] args) {
        Set<Integer> numbers = newHashSet(5, 1, 3);
        Integer biggest = new BiggestNumberFinder().find(numbers);
    }
}
