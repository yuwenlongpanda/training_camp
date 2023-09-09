package com.practice.day03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestDesignLinkedList {

    @Test
    @DisplayName("测试 search")
    public void test1() {
        DesignLinkedList myLinkedList = new DesignLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // 链表变为 1->2->3
        myLinkedList.get(1);              // 返回 2
        myLinkedList.deleteAtIndex(1);    // 现在，链表变为 1->3
        myLinkedList.get(1);              // 返回 3
    }
}
