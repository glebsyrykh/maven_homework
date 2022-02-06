import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndexStorageTest {

    public IndexStorage indexStorage = new IndexStorage(5);

    @Test
    public void testGet() {
        Assertions.assertEquals(-3, indexStorage.get(3));
        Assertions.assertEquals(2, indexStorage.get(2));
    }
}
