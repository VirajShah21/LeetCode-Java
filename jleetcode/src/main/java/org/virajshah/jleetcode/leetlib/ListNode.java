package org.virajshah.jleetcode.leetlib;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode implementation of a singly-linked list.
 */
public class ListNode {
    /**
     * The value stored in this node
     */
    public int val;

    /**
     * A pointer to the next node in the list
     */
    public ListNode next;

    /**
     * Constructs ListNode{val=0 next=null}
     */
    public ListNode() {}

    /**
     * Constructs ListNode with a specified value.
     * 
     * @param val The value to assign to this node
     */
    public ListNode(int val) {
        this.val = val;
    }

    /**
     * Constructs ListNode with a specified value and a specified next value.
     * 
     * @param val  The value of this node.
     * @param next A pointer to the next node in the list.
     */
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * NOT INCLUDED IN LEETCODE. This should only be used for testing. Converts the
     * linked list to an array list.
     * 
     * @return The List implementation of the linked list.
     */
    public List<Integer> toArrayList() {
        List<Integer> list = new ArrayList<>();
        ListNode curr = this;

        do {
            list.add(curr.val);
            curr = curr.next;
        } while (curr != null);

        return list;
    }
}
