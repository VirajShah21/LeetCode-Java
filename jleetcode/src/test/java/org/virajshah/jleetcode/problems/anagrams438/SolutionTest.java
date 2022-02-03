package org.virajshah.jleetcode.problems.anagrams438;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    public final void setUp() {
        solution = new Solution();
    }

    @Test
    public final void testFindAnagramsWithExample1() {
        List<Integer> results = new ArrayList<>();
        results = solution.findAnagrams("cbaebabacd", "abc");
        assert results.get(0) == 0;
        assert results.get(1) == 6;
    }

    @Test
    public final void testFindAnagramsWithExample2() {
        List<Integer> results = new ArrayList<>();
        results = solution.findAnagrams("abab", "ab");
        assert results.get(0) == 0;
        assert results.get(1) == 1;
        assert results.get(2) == 2;
    }

}
