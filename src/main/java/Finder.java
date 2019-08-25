public class Finder {

    public static void main(String[] args) {
        int[] a1 = {2, 8, 7, 3, 4};
        int[] a2 = {5, 9, 1, 7, 3};
        int[] a3 = null;
        int[] a4 = {2, 8, 8, 7, 3, 3, 4};

        System.out.println(" max = " + findMax(a1) + " min = " + findMin(a1));
        System.out.println(" max = " + findMax(a2) + " min = " + findMin(a2));
        System.out.println(" max = " + findMax(a3) + " min = " + findMin(a3));
        System.out.println(" max = " + findMax(a4) + " min = " + findMin(a4));
    }


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
