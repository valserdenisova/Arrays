package ru.netology.stats;

public class StatsService {

    public long getAmountSales(long[] sales) {
        long amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public long getAverageSales(long[] sales) {
        long averageSales;
        averageSales = getAmountSales(sales) / 12;
        return averageSales;
    }

    public int getMaxDay(long[] sales) {
        int maxDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxDay]) {
                maxDay = i;
            }
        }
        return maxDay + 1;
    }

    public int getMinDay(long[] sales) {
        int minDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minDay]) {
                minDay = i;
            }
        }
        return minDay + 1;
    }

    public int getNumUnderAverage(long[] sales) {
        int numUnderAverage = 0;
        long averageSales;
        averageSales = getAverageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                numUnderAverage++;
            }
        }
        return numUnderAverage;
    }

    public int getNumOverAverage(long[] sales) {
        int numOverAverage = 0;
        long averageSales;
        averageSales = getAverageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                numOverAverage++;
            }
        }
        return numOverAverage;
    }
}