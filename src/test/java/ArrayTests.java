import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Checks every method of the exercise. Each test's name says the values it uses and the answer it expects,
 * so a failing test tells you which case to look at. You don't need to change this file.
 */
class ArrayTests
{
    private static final String[] FULL_WEEK = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static final String[] WORK_WEEK = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    private static final String[] SHORT_MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    // Week

    @Test
    @DisplayName("daysOfTheWeek() gives the 7 days, Sunday first")
    void daysOfTheWeek()
    {
        assertArrayEquals(FULL_WEEK, Week.daysOfTheWeek());
    }

    @Test
    @DisplayName("monthsOfTheYear() gives the 12 months, January first and December last")
    void monthsOfTheYear()
    {
        String[] months = Week.monthsOfTheYear();
        assertEquals(12, months.length, "There should be 12 months.");
        assertEquals("January", months[0]);
        assertEquals("June", months[5]);
        assertEquals("December", months[11]);
    }

    @Test
    @DisplayName("firstDayOfWeek: a full week starts on Sunday, a work week on Monday")
    void firstDayOfWeek()
    {
        assertEquals("Sunday", Week.firstDayOfWeek(FULL_WEEK));
        assertEquals("Monday", Week.firstDayOfWeek(WORK_WEEK));
    }

    @Test
    @DisplayName("lastDayOfWeek: a full week ends on Saturday, a work week on Friday")
    void lastDayOfWeek()
    {
        assertEquals("Saturday", Week.lastDayOfWeek(FULL_WEEK));
        assertEquals("Friday", Week.lastDayOfWeek(WORK_WEEK));
    }

    @Test
    @DisplayName("monthName: month 2 is Feb, 8 is Aug, 1 is Jan and 12 is Dec")
    void monthName()
    {
        assertEquals("Feb", Week.monthName(SHORT_MONTHS, 2));
        assertEquals("Aug", Week.monthName(SHORT_MONTHS, 8));
        assertEquals("Jan", Week.monthName(SHORT_MONTHS, 1));
        assertEquals("Dec", Week.monthName(SHORT_MONTHS, 12));
    }

    // NumberLists

    @Test
    @DisplayName("oneToFifty() gives 50 numbers: 1, 2, 3 ... 50")
    void oneToFifty()
    {
        int[] numbers = NumberLists.oneToFifty();
        assertEquals(50, numbers.length, "There should be 50 numbers.");
        for (int i = 0; i < 50; i++)
        {
            assertEquals(i + 1, numbers[i], "The number at index " + i + " should be " + (i + 1) + ".");
        }
    }

    @Test
    @DisplayName("evenNumbers() gives 100 numbers: 2, 4, 6 ... 200")
    void evenNumbers()
    {
        int[] evens = NumberLists.evenNumbers();
        assertEquals(100, evens.length, "There should be 100 even numbers.");
        for (int i = 0; i < 100; i++)
        {
            assertEquals((i + 1) * 2, evens[i], "The number at index " + i + " should be " + ((i + 1) * 2) + ".");
        }
    }

    @Test
    @DisplayName("sumNumbers: {1, 2, 3, 4} is 10, {1, 3, 5} is 9, {} is 0")
    void sumNumbers()
    {
        assertEquals(10, NumberLists.sumNumbers(new int[] {1, 2, 3, 4}));
        assertEquals(9, NumberLists.sumNumbers(new int[] {1, 3, 5}));
        assertEquals(0, NumberLists.sumNumbers(new int[] {}));
    }

    @Test
    @DisplayName("doubleEvens: {1, 2, 3, 4} is 12, {10, 11, 13} is 20, {1, 3, 5} is 0")
    void doubleEvens()
    {
        assertEquals(12, NumberLists.doubleEvens(new int[] {1, 2, 3, 4}));
        assertEquals(20, NumberLists.doubleEvens(new int[] {10, 11, 13}));
        assertEquals(0, NumberLists.doubleEvens(new int[] {1, 3, 5}));
    }

    @Test
    @DisplayName("sumEveryThird: {1, 2, 3, 4} is 5, {1, 3, 5} is 1, {1, 1, 2, 3, 5, 8, 13} is 17")
    void sumEveryThird()
    {
        assertEquals(5, NumberLists.sumEveryThird(new int[] {1, 2, 3, 4}));
        assertEquals(1, NumberLists.sumEveryThird(new int[] {1, 3, 5}));
        assertEquals(17, NumberLists.sumEveryThird(new int[] {1, 1, 2, 3, 5, 8, 13}));
    }

    @Test
    @DisplayName("reversed: {1, 2, 3, 4} gives a new {4, 3, 2, 1} and leaves the original as it was")
    void reversed()
    {
        int[] original = {1, 2, 3, 4};
        assertArrayEquals(new int[] {4, 3, 2, 1}, NumberLists.reversed(original));
        assertArrayEquals(new int[] {1, 2, 3, 4}, original, "The array you were given should not change.");
        assertArrayEquals(new int[] {7}, NumberLists.reversed(new int[] {7}));
    }

    // Names

    @Test
    @DisplayName("hasName: Kent and kent are in {Ron, Lisa, Kent, Michelle}")
    void hasNameFindsAName()
    {
        String[] names = {"Ron", "Lisa", "Kent", "Michelle"};
        assertTrue(Names.hasName(names, "Kent"));
        assertTrue(Names.hasName(names, "kent"));
    }

    @Test
    @DisplayName("hasName: Jenny is not in {Ron, Lisa, Kent, Michelle}")
    void hasNameMissesAName()
    {
        assertFalse(Names.hasName(new String[] {"Ron", "Lisa", "Kent", "Michelle"}, "Jenny"));
    }

    @Test
    @DisplayName("countName in {Ron, Michelle, Lisa, Kent, Michelle}: Ron 1, michelle 2, Jenny 0")
    void countName()
    {
        String[] names = {"Ron", "Michelle", "Lisa", "Kent", "Michelle"};
        assertEquals(1, Names.countName(names, "Ron"));
        assertEquals(2, Names.countName(names, "michelle"));
        assertEquals(0, Names.countName(names, "Jenny"));
    }

    @Test
    @DisplayName("indexOfName in {Ron, Lisa, Kent, Lisa}: Lisa is 1 (the first one), Ron is 0, lisa is -1")
    void indexOfName()
    {
        String[] names = {"Ron", "Lisa", "Kent", "Lisa"};
        assertEquals(1, Names.indexOfName(names, "Lisa"));
        assertEquals(0, Names.indexOfName(names, "Ron"));
        assertEquals(-1, Names.indexOfName(names, "lisa"));
    }

    // Prices

    @Test
    @DisplayName("averagePrice: {12.75, 10.25, 8.44, 9.20} is 10.16, {15.25, 2.34, 3.50} is 7.03")
    void averagePrice()
    {
        assertEquals(10.16, Prices.averagePrice(new double[] {12.75, 10.25, 8.44, 9.20}), 0.0001);
        assertEquals(7.03, Prices.averagePrice(new double[] {15.25, 2.34, 3.50}), 0.0001);
    }

    @Test
    @DisplayName("highestPrice: {12.75, 10.25, 8.44, 9.20} is 12.75, {15.25, 21.34, 3.50} is 21.34")
    void highestPrice()
    {
        assertEquals(12.75, Prices.highestPrice(new double[] {12.75, 10.25, 8.44, 9.20}), 0.0001);
        assertEquals(21.34, Prices.highestPrice(new double[] {15.25, 21.34, 3.50}), 0.0001);
    }

    @Test
    @DisplayName("salesTotal skips refunds: {12.75, -5.50, 10.25} is 23.0, {-3.00, -1.00} is 0.0")
    void salesTotalSkipsRefunds()
    {
        assertEquals(23.0, Prices.salesTotal(new double[] {12.75, -5.50, 10.25}), 0.0001);
        assertEquals(0.0, Prices.salesTotal(new double[] {-3.00, -1.00}), 0.0001);
    }

    @Test
    @DisplayName("salesTotal stops at a 0: {8.00, 4.50, 0, 20.00} is 12.5")
    void salesTotalStopsAtZero()
    {
        assertEquals(12.5, Prices.salesTotal(new double[] {8.00, 4.50, 0, 20.00}), 0.0001);
    }

    // Grids

    @Test
    @DisplayName("gridTotal: {{1, 2, 3}, {4, 5, 6}} is 21, {{10}, {20, 30}} is 60")
    void gridTotal()
    {
        assertEquals(21, Grids.gridTotal(new int[][] {{1, 2, 3}, {4, 5, 6}}));
        assertEquals(60, Grids.gridTotal(new int[][] {{10}, {20, 30}}));
    }

    @Test
    @DisplayName("columnTotals: {{1, 2, 3}, {4, 5, 6}} gives {5, 7, 9}, {{42, 38}, {40, 44}, {39, 41}} gives {121, 123}")
    void columnTotals()
    {
        assertArrayEquals(new int[] {5, 7, 9}, Grids.columnTotals(new int[][] {{1, 2, 3}, {4, 5, 6}}));
        assertArrayEquals(new int[] {121, 123}, Grids.columnTotals(new int[][] {{42, 38}, {40, 44}, {39, 41}}));
    }

    @Test
    @DisplayName("countAbove: 2 numbers in {{42, 38, 51}, {40, 44, 49}} are over 45, none in {{1, 2}, {3, 4}} are over 10")
    void countAbove()
    {
        assertEquals(2, Grids.countAbove(new int[][] {{42, 38, 51}, {40, 44, 49}}, 45));
        assertEquals(0, Grids.countAbove(new int[][] {{1, 2}, {3, 4}}, 10));
    }

    @Test
    @DisplayName("timesTable(3) is {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}}")
    void timesTable()
    {
        int[][] table = Grids.timesTable(3);
        assertEquals(3, table.length, "There should be 3 rows.");
        assertArrayEquals(new int[] {1, 2, 3}, table[0]);
        assertArrayEquals(new int[] {2, 4, 6}, table[1]);
        assertArrayEquals(new int[] {3, 6, 9}, table[2]);
    }
}
