package org.example;

public class ArrayChallenges {
    /* PRODUCT OF ARRAY EXCEPT SELF
    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    You must write an algorithm that runs in O(n) time and without using the division operation.

    Constraints:

    2 <= nums.length <= 10^5
    -30 <= nums[i] <= 30
    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

    Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
     */
    public static int[] productExceptSelf(int[] nums) {
         int counter = 1;
         int[] answer = new int[nums.length];

        for(int i = 0; i< nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(i!=j){
                    counter = counter*nums[j];
                }
            }
            answer[i] = counter;
            counter = 1;
        }

        return answer;
    }
}
