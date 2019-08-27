import org.junit.*;

import static org.junit.Assert.assertEquals;
public class FinderTest {
    @Test
    public void findMax_normal() {
        int[] intArray = {2, 8, 7, 3, 4};

        int expectedResult = 8;
        int actualResult = Finder.findMax(intArray);
        // test
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void findMin_normal() {
        int[] intArray = {2, 8, 7, 3, 4};

        int expectedResult = 2;
        int actualResult = Finder.findMin(intArray);
        // test
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void findMax_null() {
        int[] intArray = null;

        Integer expectedResult = null;
        Integer actualResult = Finder.findMax(intArray);
        // test
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void findMin_null() {
        int[] intArray = null;

        Integer expectedResult = null;
        Integer actualResult = Finder.findMin(intArray);
        // test
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void findMax_empty() {
        int[] intArray = new int[0];

        Integer expectedResult = null;
        Integer actualResult = Finder.findMax(intArray);
        // test
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void findMin_empty() {
        int[] intArray = new int[0];

        Integer expectedResult = null;
        Integer actualResult = Finder.findMin(intArray);
        // test
        assertEquals(actualResult,expectedResult);
    }
}
