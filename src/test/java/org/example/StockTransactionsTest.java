package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockTransactionsTest {

    @Test
    void maxProfitShouldReturnOk(){
        int[] prices = {7, 1, 5, 3, 6, 4};

        assertEquals(5, StockTransactions.maxProfit(prices));
    }

    @Test
    void maxProfitShouldReturnOk2(){
        int[] prices = {7, 6, 4, 3, 1};

        assertEquals(0, StockTransactions.maxProfit(prices));
    }

    @Test
    void maxProfitShouldReturnOk3(){
        int[] prices = {1,2};

        assertEquals(1, StockTransactions.maxProfit(prices));
    }

    @Test
    void maxProfitShouldReturnOk4(){
        int[] prices = {1,2,4};

        assertEquals(3, StockTransactions.maxProfit(prices));
    }

    @Test
    void maxProfitShouldReturnOk5(){
        int[] prices = {2,4,1};

        assertEquals(2, StockTransactions.maxProfit(prices));
    }
}
