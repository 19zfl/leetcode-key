package com.zfl19.leetcode.key.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName:S26RemovesDuplicates
 * @Description:
 *
 * 26-删除有序数组中的重复项
 * 给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
 *
 * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
 *
 * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
 * 返回 k 。
 *
 * @Author:zfl19
 * @CreateDate:2024/4/6 20:07
 */

public class S26RemovesDuplicates {

    private static int[] expectedNums;

    public static void main(String[] args) {

        int[] arr = typeConversion();
        int[] nums = bubbleSort(arr);

        int k = removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        System.out.println(k + ", nums = " + Arrays.toString(expectedNums));

    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        expectedNums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            expectedNums[i] = list.get(i);
        }
        return expectedNums.length;
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;

    }

    public static int[] typeConversion() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int[] nums = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            nums[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }
        return nums;
    }

}
