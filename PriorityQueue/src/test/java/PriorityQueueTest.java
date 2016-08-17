import org.junit.Test;
import static org.junit.Assert.*;

public class PriorityQueueTest {
    @Test public void insert() {
        PriorityQueue classUnderTest = new PriorityQueue("PRIORITY");
        assertTrue("IIOPRRTY", classUnderTest.deleteMin());
    }
}
