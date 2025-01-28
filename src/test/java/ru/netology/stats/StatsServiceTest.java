package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldGetAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSales = 180;
        long actualSales = service.getAmountSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldGetAverageAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverage = 15;
        long actualAverage = service.getAverageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldGetMaxDay() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxDay = 8;
        int actualMaxDay = service.getMaxDay(sales);

        Assertions.assertEquals(expectedMaxDay, actualMaxDay);
    }

    @Test
    public void shouldGetMinDay() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinDay = 9;
        int actualMinDay = service.getMinDay(sales);

        Assertions.assertEquals(expectedMinDay, actualMinDay);
    }

    @Test
    public void shouldGetMonUnder() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonUnder = 5;
        int actualMonUnder = service.getNumUnderAverage(sales);

        Assertions.assertEquals(expectedMonUnder, actualMonUnder);
    }

    @Test
    public void shouldGetMonOver() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonOver = 5;
        int actualMonOver = service.getNumOverAverage(sales);

        Assertions.assertEquals(expectedMonOver, actualMonOver);
    }
}
