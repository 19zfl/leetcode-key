package com.zfl19.leetcode.key.simple;

import java.util.Arrays;

/**
 * @ClassName:S1SumOfTwoNums
 * @Description:
 *
 * 1-两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 *
 * @Author:zfl19
 * @CreateDate:2024/4/7 18:30
 */

public class S1SumOfTwoNums {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8};
        int target = 15;
        S1SumOfTwoNums s1SumOfTwoNums = new S1SumOfTwoNums();
        int[] ints = s1SumOfTwoNums.twoSum(arr, target);
        System.out.println(Arrays.toString(ints));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (target - nums[i] == nums[j]) {
                    arr[0] = j;
                    arr[1] = i;
                }
            }
        }
        return arr;
    }

}
