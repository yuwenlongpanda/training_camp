package com.practice.day02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.practice.day02.SquaresOfASortedArray.sortedSquares;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSquaresOfASortedArray {

    @Test
    @DisplayName("测试 search")
    public void test1() {
        int[] arr = {-4, -1, 0, 3, 10};
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, sortedSquares(arr));
    }
}
