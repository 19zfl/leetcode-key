package com.zfl19.leetcode.key.simple;

import java.util.Arrays;

/**
 * @ClassName:S88MergeTwoOrderedArrays
 * @Description:
 *
 * 88.合并两个有序数组
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 *
 * @Author:zfl19
 * @CreateDate:2024/4/9 12:39
 */

public class S88MergeTwoOrderedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m > 0 && n > 0) {
            int index = 0;
            for (int i = m; i < nums1.length; i++) {
                if (nums1[i] == 0 || nums1[i] < 0) {
                    if (index < n) {
                        nums1[i] = nums2[index++];
                    }
                }
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
        }
        Arrays.sort(nums1);
    }
}
