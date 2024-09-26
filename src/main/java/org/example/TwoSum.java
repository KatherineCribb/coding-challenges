package org.example;

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

        //time: O(n^2) space: O(1)
        if(nums.length >= 2){
            int remaining;
            for (int i = 0; i< nums.length; i++){
                remaining = target - (nums[i]);
                for(int j = i+1 ; j<= nums.length-1; j++){
                    if(nums[j] == remaining){
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
