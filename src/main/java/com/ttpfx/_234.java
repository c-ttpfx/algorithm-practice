package com.ttpfx;

/**
 * @author ttpfx
 * @since 2026/1/21
 */
public class _234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfNode = reverseNode(slow.next);

        ListNode p1 = head;
        ListNode p2 = secondHalfNode;
        boolean result = true;
        while (p2 != null) {
            if (p1.val != p2.val) {
                result = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        slow.next = reverseNode(secondHalfNode);
        return result;
    }

    public ListNode reverseNode(ListNode head) {
        ListNode p1 = null;
        ListNode p2 = head;
        while (p2 != null) {
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }
        return p1;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;

        boolean palindrome = new _234().isPalindrome(node1);
        System.out.println(palindrome);
    }
}
