package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzz {
    /*
     * Given a number n, for each integer i in the range from 1 to n inclusive, print one value per line as follows:
     *      • If /is a multiple of both 3 and 5, print FizzBuzz.
     *      • If /is a multiple of 3 (but not 5), print Fizz.
     *      • If /is a multiple of 5 (but not 3), print Buzz.
     *      • If i is not a multiple of 3 or 5, print the value of i.
     * Function Description
     * Complete the function fizzBuzz in the editor below.
     * fizzBuzz has the following parameters):
     * int n: upper limit of values to test (inclusive)
     * Returns: Originally would return NONE but for purpose of testing will return an array
     * Prints:
     * The function must print the appropriate response for each value i in the set {1, 2, ... n} in ascending order, each on a separate line.
     * Constraints
     *      • 0<n< 2x105
     */
    public static ArrayList<String> fizzBuzz(int n) { // Time: O(n) Space: O(1)
        ArrayList<String> result = new ArrayList<>();

        for(Integer i = 1; i<=n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print("FizzBuzz \n");
                result.add("FizzBuzz");
            }else if (i % 3 == 0){
                System.out.print("Fizz \n");
                result.add("Fizz");
            }else if (i % 5 == 0){
                System.out.print("Buzz \n");
                result.add("Buzz");
            }else{
                System.out.print(i + "\n");
                result.add(i.toString());
            }
        }
        return result;
    }
}
