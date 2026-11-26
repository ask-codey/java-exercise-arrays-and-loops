/*
 * Searching and counting names.
 * Lessons: For-Each Loop, Stopping and Skipping: break and continue.
 */
public class Names
{
    /*
     * Return true if nameToFind is in the array of names, and false if it isn't.
     * Capital letters don't matter: "kent" finds "Kent".
     * (name.equalsIgnoreCase(other) compares two Strings without caring about capital letters.
     * You saw it in While Loop; Useful String Methods, in the next chapter, teaches it fully.)
     *
     * hasName({"Ron", "Lisa", "Kent", "Michelle"}, "Kent") -> true
     * hasName({"Ron", "Lisa", "Kent", "Michelle"}, "kent") -> true
     * hasName({"Ron", "Lisa", "Kent", "Michelle"}, "Jenny") -> false
     */
    public static boolean hasName(String[] names, String nameToFind)
    {
        return false;
    }

    /*
     * Return how many times nameToFind is in the array of names. Capital letters don't matter.
     *
     * countName({"Ron", "Michelle", "Lisa", "Kent", "Michelle"}, "Ron") -> 1
     * countName({"Ron", "Michelle", "Lisa", "Kent", "Michelle"}, "michelle") -> 2
     * countName({"Ron", "Michelle", "Lisa", "Kent", "Michelle"}, "Jenny") -> 0
     */
    public static int countName(String[] names, String nameToFind)
    {
        return 0;
    }

    /*
     * Return the index of the first name in the array that is exactly nameToFind (here capital
     * letters DO matter: compare with equals), and stop looking once you find it.
     * Return -1 when it isn't there.
     *
     * indexOfName({"Ron", "Lisa", "Kent", "Lisa"}, "Lisa") -> 1
     * indexOfName({"Ron", "Lisa", "Kent", "Lisa"}, "Ron") -> 0
     * indexOfName({"Ron", "Lisa", "Kent", "Lisa"}, "lisa") -> -1
     */
    public static int indexOfName(String[] names, String nameToFind)
    {
        return 0;
    }
}
