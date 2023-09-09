package com.practice.day04;

public class SwapNodesInPairs {

    // 链表操作模拟题
    // 遍历链表cur表示当前节点，设置p1, p2分表代表需要交换的第一个节点和第二个节点
    // 分为三步，p1.next = p2.next, p2.next = p1, cur.next = p2
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode cur = dummy;
        ListNode p1, p2;

        while ((p1 = cur.next) != null && (p2 = p1.next) != null) {
            ListNode next = p1;

            p1.next = p2.next;
            p2.next = p1;
            cur.next = p2;

            cur = next;
        }
        return dummy.next;
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
