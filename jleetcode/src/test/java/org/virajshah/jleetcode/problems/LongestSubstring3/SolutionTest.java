package org.virajshah.jleetcode.problems.LongestSubstring3;

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
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public final void testExample2() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public final void testExample3() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public final void testWithSingleBlankSpace() {
        assertEquals(1, solution.lengthOfLongestSubstring(" "));
    }

    @Test
    public final void testWithTwoUniqueChars() {
        assertEquals(2, solution.lengthOfLongestSubstring("au"));
    }

    @Test
    public final void testWithAbba() {
        assertEquals(2, solution.lengthOfLongestSubstring("abba"));
    }

    @Test
    public final void testWeirdString() {
        assertEquals(5, solution.lengthOfLongestSubstring("tmmzuxt"));
    }

    public static void main(String[] args) {
        SolutionTest test = new SolutionTest();
        test.setUp();
        test.testWeirdString();
    }
}
