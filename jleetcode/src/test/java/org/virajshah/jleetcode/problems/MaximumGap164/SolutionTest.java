package org.virajshah.jleetcode.problems.MaximumGap164;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(3, solution.maximumGap(new int[] { 3, 6, 9, 1 }));
    }

    @Test
    public final void testExample2() {
        assertEquals(0, solution.maximumGap(new int[] { 10 }));
    }
}
