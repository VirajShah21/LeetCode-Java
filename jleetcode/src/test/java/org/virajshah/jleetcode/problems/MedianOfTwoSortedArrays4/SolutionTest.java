package org.virajshah.jleetcode.problems.MedianOfTwoSortedArrays4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    public final void setUp() {
        solution = new Solution();
    }

    @Test
    public final void testExample1() {
        assertEquals(2.0, solution.findMedianSortedArrays(new int[] { 1, 3 },
                new int[] { 2 }));
    }

    @Test
    public final void testExample2() {
        assertEquals(2.5, solution.findMedianSortedArrays(new int[] { 1, 2 },
                new int[] { 3, 4 }));
    }
}
