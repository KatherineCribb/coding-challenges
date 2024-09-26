package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /* TWO SUM
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    Constraints:
    2 <= nums.length <= 10^4
    -10^9 <= nums[i] <= 10^9
    -10^9 <= target <= 10^9
    Only one valid answer exists.

    Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
    */

    public static int[] getTwoSum(int[] nums, int target) {
        int[] result = new int[2];

        //Time: O(n) and space: O(n) for the extra space for hashTable
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}
