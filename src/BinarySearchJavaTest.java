import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchJavaTest {
    @Test
    void testFindSingleElement() {
        int[] array = {6};
        Result expected = new Result(0, 0);
        Result actual = BinarySearchJava.find(array, 6);
        assertEquals(expected, actual);
    }

    @Test
    void testFindElementInArray() {
        int[] array = {1, 3, 4, 6, 8, 9, 11};
        Result expected = new Result(0, 3);
        Result actual = BinarySearchJava.find(array, 6);
        assertEquals(expected, actual);
    }

    @Test
    void testElementNotFoundEmptyArray() {
        int[] array = {};
        Result expected = new Result(0, -1);
        Result actual = BinarySearchJava.find(array, 6);
        assertEquals(expected, actual);
    }

    @Test
    void testElementNotFoundInEmptyArray() {
        int[] array = {};
        Result expected = new Result(0, -1);
        Result actual = BinarySearchJava.find(array, 6);
        assertEquals(expected, actual, "Element should not be found in an empty array, expected step count is 0.");
    }

    @Test
    void testElementNotFoundInNonEmptyArray() {
        int[] array = {1, 3, 4, 5, 8, 9, 11};
        Result actual = BinarySearchJava.find(array, 6);
        assertEquals(-1, actual.index, "Element 6 should not be found, expecting index -1.");
    }
}
