package com.practice.day03;

class DesignLinkedList {

    private ListNode head;
    private int size;

    public DesignLinkedList() {
        head = new ListNode(-1);
        size = 0;
    }

    public int get(int index) {
        ListNode node = getNode(index);
        if (node == null) {
            return -1;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        ListNode prev = getNode(index - 1);
        if (prev == null) {
            return;
        }

        prev.next = new ListNode(val, prev.next);
        size++;
    }

    public void deleteAtIndex(int index) {
        ListNode prev = getNode(index - 1);
        if (prev == null || prev.next == null) {
            return;
        }

        prev.next = prev.next.next;
        size--;
    }

    public ListNode getNode(int index) {
        if (index < -1 || index > size - 1) {
            return null;
        }

        ListNode cur = head;
        while (index >= 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
