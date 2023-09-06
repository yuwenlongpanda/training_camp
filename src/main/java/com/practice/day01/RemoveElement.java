package com.practice.day01;

public class RemoveElement {

    // 双指针，newIdx 代表新数组的元素的下标，oldIdx 代表旧数组元素的下标
    public static int removeElement(int[] nums, int val) {
        int newIdx = 0;
        for (int oldIdx = 0; oldIdx < nums.length; oldIdx++) {
            if (nums[oldIdx] == val) {
                continue;
            }
            nums[newIdx] = nums[oldIdx];
            newIdx++;
        }
        return newIdx;
    }
}
