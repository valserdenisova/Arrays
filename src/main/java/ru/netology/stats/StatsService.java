package ru.netology.stats;

public class StatsService {
    int amount;
    public int getAmountSales(int[] sales) {
        amount = sales[0] + sales[1] + sales[2] + sales[3] + sales[4] + sales[5] + sales[6] + sales[7] + sales[8] + sales[9] + sales[10] + sales[11];
        return amount;
    }

    public int getAverageSales(int [] sales) {
        int averageSales;
        averageSales = getAmountSales(sales)/12;
        return averageSales;
    }

    public int getMaxDay(int[] sales) {
        int maxDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxDay]) {
                maxDay = i;
            }
        }
        return maxDay+1;
    }

    public int getMinDay(int[] sales) {
        int minDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minDay]) {
                minDay = i;
            }
        }
        return minDay+1;
    }

    public int getNumberMaxDays(int[] sales){
        int numberMaxDays = 0;
        int maxSalesDayWith1 = getMaxDay(sales);
        int maxSalesDayWithout1 = maxSalesDayWith1-1;
        for (int i=0; i < sales.length; i++) {
            if (sales[i] == sales[maxSalesDayWithout1]) {
                numberMaxDays++;
            }
        }
        return numberMaxDays;
    }

    public int getNumberMinDays(int[] sales){
        int numberMinDays = 0;
        int minSalesDayWith1 = getMinDay(sales);
        int minSalesDayWithout1 = minSalesDayWith1 -1;
        for (int i=0; i < sales.length; i++) {
            if (sales[i] == sales[minSalesDayWithout1]) {
                numberMinDays++;
            }
        }
        return numberMinDays;
    }
}
