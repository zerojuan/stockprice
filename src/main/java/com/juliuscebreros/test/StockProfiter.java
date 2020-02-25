package com.juliuscebreros.test;

public class StockProfiter {
    public static int getMax(int[] prices) {
        if (prices.length <= 1) {
            System.out.println("Not enough data to buy and sell");
            return 0;
        }

        int maxProfit = -1;
        int buyIndex = 0;
        int sellIndex = 0;
        boolean changeBuyIndex = false;
        for (int i = 0; i < prices.length - 1; i++) {
            int currSellIndex = i + 1;

            if (changeBuyIndex) {
                buyIndex = i;
            }

            int currProfit = prices[currSellIndex] - prices[buyIndex];
            if (currProfit < 0) {
                // we can't make a profit off of current buy price
                // look for a new buy price
                changeBuyIndex = true;
                continue;
            } else {
                // check if current is now the max profit
                if (currProfit > maxProfit) {
                    maxProfit = currProfit;
                    sellIndex = currSellIndex;
                }
                changeBuyIndex = false;
            }
        }

        if (maxProfit < 0) {
            System.out.println("No profit. Dont buy.");
        } else {
            System.out.println("Buy at " + buyIndex + " $" + prices[buyIndex] + ", Sell at " + sellIndex + " $"
                    + prices[sellIndex] + ". Profit: " + maxProfit);
        }

        return maxProfit;
    }
}