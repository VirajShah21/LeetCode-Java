package org.virajshah.jleetcode.problems.AddTwoNumbers2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.virajshah.jleetcode.leetlib.ListNode;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    public final void setUp() {
        solution = new Solution();
    }

    @Test
    public final void testExample1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        assertEquals(linkedListToString(expected),
                linkedListToString(solution.addTwoNumbers(l1, l2)));
    }

    @Test
    public final void testExample2() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode expected = new ListNode(0);

        assertEquals(linkedListToString(expected),
                linkedListToString(solution.addTwoNumbers(l1, l2)));
    }

    @Test
    public final void testExample3() {
        ListNode l1 = new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode expected = new ListNode(8, new ListNode(9,
                new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(1))))));

        assertEquals(linkedListToString(expected),
                linkedListToString(solution.addTwoNumbers(l1, l2)));
    }

    private String linkedListToString(ListNode list) {
        StringBuilder result = new StringBuilder();
        result.append('[');
        result.append(list.val);

        while (list.next != null) {
            list = list.next;
            result.append(", ");
            result.append(list.val);
        }

        result.append(']');

        return result.toString();
    }

    public static void main(String[] args) {
        SolutionTest test = new SolutionTest();
        test.setUp();
        test.testExample1();
    }
}
