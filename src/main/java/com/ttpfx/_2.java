package com.ttpfx;

/**
 * @author ttpfx
 * @since 2026/1/21
 */
public class _2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode p = head;
        int carryFlag = 0;
        while (l1 != null || l2 != null) {
            int k = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carryFlag;
            carryFlag = k >= 10 ? 1 : 0;
            if (k >= 10) k -= 10;
            p.next = new ListNode(k);
            p = p.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carryFlag == 1) p.next = new ListNode(1);
        return head.next;
    }
}
