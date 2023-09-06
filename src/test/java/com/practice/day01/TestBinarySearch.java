package com.practice.day01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.practice.day01.BinarySearch.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinarySearch {

    @Test
    @DisplayName("测试 search")
    public void test1() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, search(a, 7));
        assertEquals(1, search(a, 13));
        assertEquals(2, search(a, 21));
        assertEquals(3, search(a, 30));
        assertEquals(4, search(a, 38));
        assertEquals(5, search(a, 44));
        assertEquals(6, search(a, 52));
        assertEquals(7, search(a, 53));

        assertEquals(-1, search(a, 0));
        assertEquals(-1, search(a, 15));
        assertEquals(-1, search(a, 60));
    }

    @Test
    @DisplayName("测试 search")
    public void test2() {
        int[] a = {-1, 0, 3, 5, 9, 12};
        assertEquals(4, search(a, 9));
    }

    @Test
    @DisplayName("测试 search2")
    public void test3() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, search2(a, 7));
        assertEquals(1, search2(a, 13));
        assertEquals(2, search2(a, 21));
        assertEquals(3, search2(a, 30));
        assertEquals(4, search2(a, 38));
        assertEquals(5, search2(a, 44));
        assertEquals(6, search2(a, 52));
        assertEquals(7, search2(a, 53));

        assertEquals(-1, search2(a, 0));
        assertEquals(-1, search2(a, 15));
        assertEquals(-1, search2(a, 60));
    }
}
