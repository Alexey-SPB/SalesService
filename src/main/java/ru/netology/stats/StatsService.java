package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long sumSale = 0;
        for (long sale : sales) {
            sumSale += sale;
        }
        return sumSale;

    }

    public long average(long[] sales) {
        long sumSale = 0;
        for (long sale : sales) {
            sumSale += sale;
        }
        long average = sumSale / 12;
        return average;
    }

    public int maxMonth(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }

        }
        return month + 1;
    }

    public int minMonth(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int maxAverageMonth(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                count++;
            }
        }
//        for (int i = 0; i < sales.length; i++) {
//            if (sales[i] <= sales[month]) {
//                month = i;
//            }
        return count;
    }

    public int minAverageMonth(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                count++;
            }
        }
        return count;

    }
}


