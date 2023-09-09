package com.practice.day04;

public class LinkedListCycleLi {

    // 快慢指针，遍历链表，定义slow,fast即快慢指针
    // 当slow,fast第一次相遇后，定义两个指针，从头结点和相遇结点，各走一步，直到相遇，相遇点即为环入口
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // 第一次相遇
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }

        // 第二次相遇
        ListNode idx1 = head;
        ListNode idx2 = slow;
        while (idx1 != idx2) {
            idx1 = idx1.next;
            idx2 = idx2.next;
        }
        return idx1;
    }

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
