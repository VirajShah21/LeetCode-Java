package org.virajshah.jleetcode.problems.ClosestRoom1847;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

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
        final int[][] rooms = { { 2, 2 }, { 1, 2 }, { 3, 2 } };
        final int[][] queries = { { 3, 1 }, { 3, 3 }, { 5, 2 } };
        final int[] expected = { 3, -1, 3 };
        final int[] actual = solution.closestRoom(rooms, queries);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public final void testExample2() {
        final int[][] rooms = { { 1, 4 }, { 2, 3 }, { 3, 5 }, { 4, 1 }, { 5, 2 } };
        final int[][] queries = { { 2, 3 }, { 2, 4 }, { 2, 5 } };
        final int[] expected = { 2, 1, 3 };
        final int[] actual = solution.closestRoom(rooms, queries);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public final void testOther() {
        final int[][] rooms = { { 11, 6 }, { 6, 11 }, { 1, 22 }, { 20, 2 }, { 21, 7 }, { 8, 15 },
                { 4, 17 }, { 13, 22 }, { 17, 16 }, { 22, 11 } };
        final int[][] queries = { { 21, 20 }, { 23, 24 }, { 6, 20 }, { 5, 23 }, { 8, 1 }, { 1, 4 },
                { 10, 11 }, { 24, 10 }, { 7, 12 }, { 7, 7 } };
        final int[] expected = { 13, -1, 1, -1, 8, 1, 8, 22, 8, 6 };
        final int[] actual = solution.closestRoom(rooms, queries);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    public static void main(String[] args) {
        SolutionTest test = new SolutionTest();
        test.setUp();
        test.testExample1();
        // test.testOther();
    }
}
