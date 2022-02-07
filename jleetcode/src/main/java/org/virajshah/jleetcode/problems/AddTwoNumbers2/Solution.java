package org.virajshah.jleetcode.problems.AddTwoNumbers2;

import org.virajshah.jleetcode.leetlib.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        byte carry = 0;
        byte sum;
        ListNode result = new ListNode();
        ListNode root = result;
        do {
            result.next = new ListNode();
            result = result.next;

            sum = carry;
            carry = 0;

            if (l1 != null)
                sum += l1.val;
            if (l2 != null)
                sum += l2.val;

            if (sum >= 10) {
                carry++;
                sum -= 10;
            }

            result.val = sum;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        } while (l1 != null || l2 != null);

        if (carry > 0)
            result.next = new ListNode(carry);

        return root.next;
    }

}
