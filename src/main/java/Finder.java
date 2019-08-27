/**
 * Contains methods which find the min or max number in an int array
 *
 * @author  Charlie Stejskal (cjs0057@auburn.edu)
 * @version 2019-08-25
 */
public class Finder {

    /**
     * Selects the minimum value from the int array intArray
     */
    public static Integer findMax(int[] intArray) {
        if ((intArray == null) || (intArray.length == 0)) {
            return null;
        }
        int max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;
    }

    /**
     * Selects the minimum value from the int array intArray
     */
    public static Integer findMin(int[] intArray) {
        if ((intArray == null) || (intArray.length == 0)) {
            return null;
        }
        int min = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        return min;
    }
}
