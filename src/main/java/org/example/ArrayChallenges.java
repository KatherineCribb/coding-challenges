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
        //prefix and suffix approach
        int n = nums.length;
        int[] answer = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        suffix[n-1] = 1;

        for(int i = 1; i<n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        for(int i = n-2; i>-1; i--){
            suffix[i] = suffix[i+1] * nums[i+1] ;
        }

        for (int i = 0; i<n; i ++){
            answer[i] = prefix[i] * suffix[i];
        }
        return answer;
    }
}
