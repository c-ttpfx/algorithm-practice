package com.ttpfx;

/**
 * @author ttpfx
 * @since 2026/1/21
 */
public class _206 {

//    public ListNode reverseList(ListNode head) {
//        ListNode p1 = null;
//        ListNode p2 = head;
//        while (p2 != null) {
//            ListNode temp = p2.next;
//            p2.next = p1;
//            p1 = p2;
//            p2 = temp;
//        }
//        return p1;
//    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
