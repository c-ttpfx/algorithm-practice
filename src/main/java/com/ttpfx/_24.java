package com.ttpfx;

/**
 * @author ttpfx
 * @since 2026/1/22
 */
public class _24 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode nextHandleNode = head.next.next;
        ListNode newHead = head.next;
        newHead.next = head;
        head.next = swapPairs(nextHandleNode);

        return newHead;
    }
}
