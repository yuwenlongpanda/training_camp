package com.practice.day08;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.practice.day08.ReverseWordsInAString.reverseWords;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReverseWordsInAString {

    @Test
    @DisplayName("测试 reverseWords")
    public void test1() {
        assertEquals("blue is sky the", reverseWords("the sky is blue"));
        assertEquals("world hello", reverseWords("  hello world  "));
    }
}
