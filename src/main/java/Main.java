import java.util.Arrays;

/*
 * Try your methods here: run this file and change it as you like. The tests don't use it.
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(Week.daysOfTheWeek()));
        System.out.println(NumberLists.sumNumbers(new int[] {1, 2, 3, 4}));
        System.out.println(Names.hasName(new String[] {"Ron", "Lisa", "Kent"}, "kent"));
        System.out.println(Prices.averagePrice(new double[] {12.75, 10.25, 8.44, 9.20}));
        System.out.println(Grids.gridTotal(new int[][] {{1, 2, 3}, {4, 5, 6}}));
    }
}
