package com.ttpfx;

/**
 * @author ttpfx
 * @since 2026/1/22
 */
public class _25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        // todo 还未完成
        if (head == null || head.next == null) return head;
        int kt = k;
        ListNode startNode = head;
        ListNode handleNode = head;
        while (kt-- > 0 && head != null) head = head.next;
        kt = k;
        ListNode pre = null;
        while (kt-- > 0 && handleNode != null) {
            ListNode temp = handleNode.next;
            handleNode.next = pre;
            pre = handleNode;
            handleNode = temp;
        }
        startNode.next = reverseKGroup(head, k);
        return handleNode;
    }
}
