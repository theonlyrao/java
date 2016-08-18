import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
    @Test public void insert() {
        Node classUnderTest = new Node("A", "B", null);
        assertEquals("A", classUnderTest.getData());
        assertEquals("B", classUnderTest.getChildOne());
        assertEquals(null, classUnderTest.getChildTwo());	
    }
}
