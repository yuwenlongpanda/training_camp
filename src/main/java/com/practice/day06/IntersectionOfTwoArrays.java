package com.practice.day06;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    // 遍历num1, 定义一个set1存储nums1；遍历nums2, 定义set2存储交集元素，最后将set2转换为int数组返回
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num1 : nums1) {
            set1.add(num1);
        }

        for (int num2 : nums2) {
            if (set1.contains(num2)) {
                set2.add(num2);
            }
        }

        int[] res = new int[set2.size()];
        int i = 0;
        for (Integer item : set2) {
            res[i++] = item;
        }
        return res;
    }
}

