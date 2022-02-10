import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayIndexStorageTest {

    public int arr[] = {0, 1, 1, 2, 0, 1, 1};
    ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(arr);

    @Test
    public void testSize() {
        Assertions.assertEquals(7, arrayIndexStorage.size());
    }

    @Test
    public void testGet() {
        Assertions.assertEquals(1, arrayIndexStorage.get(2));
    }

    @Test
    public void testReverse() {
        int reverseArr[] = {1, 1, 0, 2, 1, 1, 0};
        Assertions.assertArrayEquals(reverseArr, arrayIndexStorage.reverse());
    }

    @Test
    public void testReverseEven() {
        int evenArr[] = {1, 1, 2, 2, 1, 1};
        arrayIndexStorage = new ArrayIndexStorage(evenArr);
        Assertions.assertArrayEquals(evenArr, arrayIndexStorage.reverse());
    }
}
