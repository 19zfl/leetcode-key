package com.zfl19.leetcode.key.simple;

import java.util.Arrays;

/**
 * @ClassName:S27RemoveElement
 * @Description:
 *
 * 27. 移除元素
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
 * 输出：5, nums = [0,1,3,0,4]
 *
 * @Author:zfl19
 * @CreateDate:2024/4/9 9:09
 */

public class S27RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index= 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
