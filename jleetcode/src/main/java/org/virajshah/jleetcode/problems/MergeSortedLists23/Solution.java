package org.virajshah.jleetcode.problems.MergeSortedLists23;

import org.virajshah.jleetcode.leetlib.ListNode;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode root = new ListNode();
        ListNode last = root;

        int min;

        while (!isNullList(lists)) {
            min = 0;
            for (int i = 0; i < lists.length; i++)
                if (lists[i] != null && (lists[min] == null || lists[i].val < lists[min].val))
                    min = i;
            last.next = lists[min];
            last = last.next;
            lists[min] = lists[min].next;
        }

        return root.next;
    }

    private static boolean isNullList(ListNode[] lists) {
        for (ListNode list : lists)
            if (list != null)
                return false;
        return true;
    }
}
