package com.practice.day08;

import java.util.Arrays;

class ReverseWordsInAString {

    // 字符串操作题
    // 1.同移除元素，移除字符串的前后和中间的空格
    // 2.反转整个字符串
    // 3.逐个反转单词
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
        int newIdx = 0;

        for (int oldIdx = 0; oldIdx < len; oldIdx++) {
            if (arr[oldIdx] != ' ') {
                arr[newIdx] = arr[oldIdx];
                newIdx++;
                continue;
            }

            while (oldIdx < len - 1 && arr[oldIdx + 1] == ' ') {
                oldIdx++;
            }

            // 首尾不加空格
            if (newIdx == 0 || oldIdx == len - 1) {
                continue;
            }
            arr[newIdx] = ' ';
            newIdx++;
        }
        return Arrays.copyOf(arr, newIdx);
    }

    public static String reverseWord(char[] arr) {
        int len = arr.length;

        int left = 0;
        int right = 0;
        for (int i = 0; i < len; i++) {
            left = i;

            while (i < len && arr[i] != ' ') {
                i++;
            }

            // 跳出循环的两种情况：1.遇到空格；2.遍历结束
            right = (i != len) ? i - 1 : len - 1;
            reverseString(arr, left, right);
        }
        return Arrays.toString(arr);
    }

    public static String reverseString(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        return new String(s);
    }
}