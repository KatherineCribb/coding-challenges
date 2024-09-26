package org.example;

public class StockTransactions {

    /* BEST TIME TO BUY AND SELL STOCK
   You are given an array prices where prices[i] is the price of a given stock on the ith day.
   You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
   Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
   Constraints:
   1 <= prices.length <= 10^5
   0 <= prices[i] <= 10^4
    */
    public static int maxProfit(int[] prices) { // Time: 0(n) Space: O(1)
        int profit = 0;
        int buyPrice = prices[0];
        for (int i = 1; i<prices.length; i++){
            if(prices[i]<buyPrice){
                buyPrice = prices[i];
            }
            if((prices[i] - buyPrice)> profit){
                profit = prices[i] - buyPrice;
            }
        }
        return profit;
    }
}
