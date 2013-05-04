package org.bill;

import org.junit.Test;

import static com.google.common.collect.Sets.newHashSet;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BiggestNumberFinderTest {

    BiggestNumberFinder finder = new BiggestNumberFinder(new BiggerIntegerComparison());
    static final Integer biggestNumber = 2;
    static final Integer smallestNumber = 1;

    @Test
    public void shouldFindBiggestNumberWhenOneIsOnlyNumber() {
        Integer actual = finder.find(newHashSet(1));
        assertThat(actual, is(1));
    }

    @Test
    public void shouldFindBiggestNumberWhenTwoIsOnlyNumber() {
        Integer actual = finder.find(newHashSet(2));
        assertThat(actual, is(2));
    }

    @Test
    public void shouldFindBiggestNumberWhenThereAreMoreThanOneNumber() {
        Integer actual = finder.find(newHashSet(biggestNumber, smallestNumber));
        assertThat(actual, is(biggestNumber));
    }
}
