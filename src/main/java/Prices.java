/*
 * Average, highest and lowest prices, and skipping what doesn't count.
 * Lessons: For-Each Loop, Stopping and Skipping: break and continue.
 */
public class Prices
{
    /*
     * Return the average of the prices, rounded to the nearest cent. The array always holds at
     * least one price. (Math.round(amount * 100) / 100.0 rounds to cents, as in Math and Random.)
     *
     * averagePrice({12.75, 10.25, 8.44, 9.20}) -> 10.16
     * averagePrice({15.25, 2.34, 3.50}) -> 7.03
     */
    public static double averagePrice(double[] prices)
    {
        return 0;
    }

    /*
     * Return the highest price. The array always holds at least one price.
     *
     * highestPrice({12.75, 10.25, 8.44, 9.20}) -> 12.75
     * highestPrice({15.25, 21.34, 3.50}) -> 21.34
     */
    public static double highestPrice(double[] prices)
    {
        return 0;
    }

    /*
     * Return the total of the day's tickets, in the order they came in.
     * Refunds are negative and don't count: skip them.
     * A ticket of 0 marks the end of the day: stop adding there, even if more tickets follow.
     *
     * salesTotal({12.75, -5.50, 10.25}) -> 23.0
     * salesTotal({8.00, 4.50, 0, 20.00}) -> 12.5
     * salesTotal({-3.00, -1.00}) -> 0.0
     */
    public static double salesTotal(double[] tickets)
    {
        return 0;
    }
}
