package org.example;

public class NumberFinder {
    /*
    How do you find the missing number in a given integer array of 1 to 100?
    There is no duplicates and only one missing number. The input is sorted.

    time complexity: O(n) space complexity: O(n)
     */
    public static int findMissingNumber(int[] array) throws Exception {
        if (array.length > 100) {
            throw new Exception("Array exceeded max capacity");
        }
        for (int i = 0; i < array.length; i++) {
            if (i + 1 != array[i]) {
                System.out.printf("The missing number is %s", i + 1);
                return i + 1;
            }
        }
        return 0;
    }
}
