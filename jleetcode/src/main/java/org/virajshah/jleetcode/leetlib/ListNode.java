package org.virajshah.jleetcode.leetlib;

/**
 * LeetCode implementation of a singly-linked list.
 */
public class ListNode {
    /**
     * The value stored in this node
     */
    int val;

    /**
     * A pointer to the next node in the list
     */
    ListNode next;

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
}
