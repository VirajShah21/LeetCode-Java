package org.virajshah.jleetcode.problems.TwoSum1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    public final void setUp() {
        solution = new Solution();
    }

    @Test
    public final void testExample1() {
        assertArrayEquals(new int[] { 0, 1 }, solution.twoSum(new int[] { 2, 7, 11, 16 }, 9));
    }

    @Test
    public final void testExample2() {
        assertArrayEquals(new int[] { 1, 2 }, solution.twoSum(new int[] { 3, 2, 4 }, 6));
    }

    @Test
    public final void testExample3() {
        assertArrayEquals(new int[] { 0, 1 }, solution.twoSum(new int[] { 3, 3 }, 6));
    }
}
