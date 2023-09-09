package com.practice.day04;

public class RemoveNthNodeFromEndOfList {

    // 链表操作模拟题
    // 1.计算链表的长度；2.获取倒数第n个节点的头节点；3.删除节点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);

        // 1.计算链表的长度
        int len = getLength(dummy);

        // 2.获取倒数第n个节点的头节点
        ListNode prev = getNode(dummy, (len - 1) - n);

        // 3.删除节点
        prev.next = prev.next.next;
        return dummy.next;
    }

    public int getLength(ListNode head) {
        ListNode cur = head;
        int len = 0;

        while (cur != null) {
            len++;
            cur = cur.next;
        }
        return len;
    }

    public ListNode getNode(ListNode head, int index) {
        ListNode cur = head;

        while (index > 0 && cur != null) {
            index--;
            cur = cur.next;
        }
        return cur;
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
