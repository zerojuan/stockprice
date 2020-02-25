package com.juliuscebreros.test;

public final class App {
    private App() {
    }

    /**
     * 
     * @param args prices of the day, space separated i.e App.class 1 2 3 4 5
     */
    public static void main(String[] args) {
        int[] prices = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            prices[i] = Integer.parseInt(args[i]);
        }

        int maxProfit = StockProfiter.getMax(prices);
        System.out.println("Profit! $" + maxProfit);
    }
}
