package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class StatsServiceTest {
    @Test
    public void testTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 180;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = 180 / 12;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testmaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxMonth(sales);
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testminMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minMonth(sales);
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testMaxAverageMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxAverageMonth(sales);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testMinAverageMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minAverageMonth(sales);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }
}
