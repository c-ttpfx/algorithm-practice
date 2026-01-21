package com.ttpfx;

/**
 * @author ttpfx
 * @since 2026/1/21
 */
public class _19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        while (n-- > 0) fast = fast.next;
        if (fast == null)return head.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
//        node1.next = node2;
        new _19().removeNthFromEnd(node1,1);
    }
}
