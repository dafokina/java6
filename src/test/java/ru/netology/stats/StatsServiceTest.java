package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void calcSumOfSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumOfSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void calcMiddleSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        int actualSum = service.middleSum(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void calcMonthOfMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.monthOfMaxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void calcMonthOfMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.monthOfMinSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void calcMonthUnderMiddleSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumber = 5;
        int actualNumber = service.calcMonthUnderMiddle(sales);
        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void calcMonthOverMiddleSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumber = 5;
        int actualNumber = service.calcMonthOverMiddle(sales);
        Assertions.assertEquals(expectedNumber, actualNumber);

    }

}
