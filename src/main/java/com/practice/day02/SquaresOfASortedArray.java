package com.practice.day02;

public class SquaresOfASortedArray {

    // 双指针，分别指向数组的头尾，比较平方大小，从大到小依次放入新数组中
    public static int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length-1;
        int[] res = new int[nums.length];

        int idx = nums.length -1;
        while(left <= right) {
            int num1 = nums[left] * nums[left];
            int num2 = nums[right] * nums[right];
            if(num1 > num2) {
                res[idx] = num1;
                left++;
            } else {
                res[idx] = num2;
                right--;
            }
            idx--;
        }
        return res;
    }
}
