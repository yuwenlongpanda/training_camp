package com.practice.day04;

public class IntersectionOfTwoLinkedListsLcci {

    // 双指针，同时遍历headA、headB，curA和curB分别代表它们的当前节点
    // headA遍历完时，curA指向headB；headB遍历完时，curB指向headA
    // 如果headA与headB相交，curA=curB=相交点，反之直至结束，此时curA==curB==null
    // 因为headA=diffA+common，headB=diffB+common，则满足 headA + diffB = headB + diffA
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;

        while (curA != curB) {
            curA = (curA != null) ? curA.next : headB;
            curB = (curB != null) ? curB.next : headA;
        }
        return curA;
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
