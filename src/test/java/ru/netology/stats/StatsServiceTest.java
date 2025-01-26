package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldGetAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 180;
        int actualSales = service.getAmountSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldGetAverageAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.getAverageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldGetMaxDay() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxDay = 8;
        int actualMaxDay = service.getMaxDay(sales);

        Assertions.assertEquals(expectedMaxDay, actualMaxDay);
    }

    @Test
    public void shouldGetMinDay() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinDay = 9;
        int actualMinDay = service.getMinDay(sales);

        Assertions.assertEquals(expectedMinDay, actualMinDay);
    }

    @Test
    public void shouldGetNumberMaxDays() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberMaxDays = 2;
        int actualNumberMaxDays = service.getNumberMaxDays(sales);

        Assertions.assertEquals(expectedNumberMaxDays, actualNumberMaxDays);
    }

    @Test
    public void shouldGetNumberMinDays() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberMinDays = 1;
        int actualNumberMinDays = service.getNumberMinDays(sales);

        Assertions.assertEquals(expectedNumberMinDays, actualNumberMinDays);
    }
}
