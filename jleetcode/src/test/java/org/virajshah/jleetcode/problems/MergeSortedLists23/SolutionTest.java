package org.virajshah.jleetcode.problems.MergeSortedLists23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.virajshah.jleetcode.leetlib.ListNode;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public final void testExample1() {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));

        ListNode actual = solution.mergeKLists(new ListNode[] { l1, l2, l3 });

        int[] expected = { 1, 1, 2, 3, 4, 4, 5, 6 };

        assertEquals(Arrays.toString(expected), actual.toArrayList().toString());
    }

    @Test
    public final void testExample2() {
        ListNode actual = solution.mergeKLists(new ListNode[] {});
        assertNull(actual);
    }

    @Test
    public final void testExample3() {
        ListNode actual = solution.mergeKLists(new ListNode[] { null });
        assertNull(actual);
    }
}
