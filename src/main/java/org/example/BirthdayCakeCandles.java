package org.example;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BirthdayCakeCandles {
    /* Birthday Cake Candles
    You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age.
    They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
* */

    public static int birthdayCakeCandles(List<Integer> candles) {
        //Time Complexity: O(n) //We must check the height of every candle
        //Space Complexity: O(1) //We only store the tallest and a frequency
        int frequency = 0, tallest = 0, height;

        for(int i = 0; i<candles.size(); i++){
            height = candles.get(i);

            if(height > tallest){
                tallest = height;
                Logger.getAnonymousLogger().log(Level.INFO, "Tallest item: {0}", tallest);
                frequency = 1;
            }else if(tallest == height){
                frequency += 1;
            }
        }
        return frequency;
    }
}
