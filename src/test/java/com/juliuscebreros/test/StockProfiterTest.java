package com.juliuscebreros.test;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class StockProfiterTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void runTest() {
        int[] sample = { 10, 7, 5, 8, 11, 9 };
        assertEquals("Example should return 6", 6, StockProfiter.getMax(sample));
        int[] descending = { 10, 9, 8, 7, 6, 5 };
        assertEquals("Descending should return -1 profit", -1, StockProfiter.getMax(descending));
        int[] ascending = { 5, 6, 7, 8, 9, 10 };
        assertEquals("Ascending should return 5 profit", 5, StockProfiter.getMax(ascending));
        int[] stable = { 5, 5, 5, 5, 5, 5 };
        assertEquals("Stable should return 0 profit", 0, StockProfiter.getMax(stable));
        int[] singleData = { 10 };
        assertEquals("Single Data should return 0 profit", 0, StockProfiter.getMax(singleData));

        int[] fullDay = new int[1440];
        Arrays.fill(fullDay, 3);
        fullDay[10] = 2;
        fullDay[12] = 1;
        fullDay[1339] = 10;
        assertEquals("Large dataset should return 9 profit", 9, StockProfiter.getMax(fullDay));
    }
}
