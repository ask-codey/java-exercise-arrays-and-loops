/*
 * Days and months: arrays you fill, and the first and last elements of an array.
 * Lessons: Java Array Basics.
 */
public class Week
{
    /*
     * Return an array of 7 Strings: the days of the week, starting with Sunday.
     *
     * daysOfTheWeek() -> {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}
     */
    public static String[] daysOfTheWeek()
    {
        return new String[0];
    }

    /*
     * Return an array of 12 Strings: the months of the year, starting with January.
     *
     * monthsOfTheYear() -> {"January", "February", ... "December"}
     */
    public static String[] monthsOfTheYear()
    {
        return new String[0];
    }

    /*
     * You're given the days of a week. Return the first one.
     * A week might start on any day: a full week starts on Sunday, a work week on Monday.
     *
     * firstDayOfWeek({"Sunday", "Monday", ... "Saturday"}) -> "Sunday"
     * firstDayOfWeek({"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}) -> "Monday"
     */
    public static String firstDayOfWeek(String[] days)
    {
        return "";
    }

    /*
     * You're given the days of a week. Return the last one. The array may have any number of days.
     *
     * lastDayOfWeek({"Sunday", "Monday", ... "Saturday"}) -> "Saturday"
     * lastDayOfWeek({"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}) -> "Friday"
     */
    public static String lastDayOfWeek(String[] days)
    {
        return "";
    }

    /*
     * You're given the names of the months and a month's number, where January is 1 and
     * December is 12. Return that month's name.
     *
     * monthName({"Jan", "Feb", "Mar", ... "Dec"}, 2) -> "Feb"
     * monthName({"Jan", "Feb", "Mar", ... "Dec"}, 8) -> "Aug"
     */
    public static String monthName(String[] months, int monthNumber)
    {
        return "";
    }
}
