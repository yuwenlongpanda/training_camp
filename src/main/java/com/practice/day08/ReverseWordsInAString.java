package com.practice.day08;

import java.util.Arrays;

class ReverseWordsInAString {

    public static String reverseWords(String s) {
        // 1.移除字符串的前后和中间的空格
        char[] arr = removeSpace(s);
        // 2.反转整个字符串
        reverseString(arr, 0, arr.length - 1);
        // 3.逐个反转单词
        reverseWord(arr);
        return new String(arr);
    }


    public static char[] removeSpace(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int left = 0, right = len - 1;

        // 移除前后的字符串
        while (left < right && arr[left] == ' ') {
            left++;
        }
        while (left < right && arr[right] == ' ') {
            right--;
        }

        // 移除中间的字符串
        int newIdx = 0;
        for (int oldIdx = left; oldIdx <= right; oldIdx++) {
            if (arr[oldIdx] != ' ') {
                arr[newIdx] = arr[oldIdx];
                newIdx++;
                continue;
            }

            // 移除连续的空格，只保留一个空格
            while (oldIdx <= right - 1 && arr[oldIdx + 1] == ' ') {
                oldIdx++;
            }
            arr[newIdx] = ' ';
            newIdx++;
        }
        return Arrays.copyOf(arr, newIdx);
    }

    public static void reverseWord(char[] arr) {
        int len = arr.length;

        int left = 0;
        int right = 0;
        for (int i = 0; i < len; i++) {
            // 跳出循环的两种情况：1.遇到空格；2.遍历结束
            if (i == len - 1 || arr[i] == ' ') {
                right = (i != len - 1) ? i - 1 : len - 1;
                reverseString(arr, left, right);
                // 更新left
                left = i + 1;
            }
        }
    }

    public static void reverseString(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}