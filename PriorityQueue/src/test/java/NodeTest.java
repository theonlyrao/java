import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
    @Test public void newWithThreeArgs() {
        Node classUnderTest = new Node("A", "B", null);
        assertEquals("A", classUnderTest.getData());
        assertEquals("B", classUnderTest.getChildOne());
        assertEquals(null, classUnderTest.getChildTwo());	
    }

    @Test public void newWithOneArg() {
        Node classUnderTest = new Node("A");
        assertEquals("A", classUnderTest.getData());
        assertEquals(null, classUnderTest.getChildOne());
        assertEquals(null, classUnderTest.getChildTwo());	
    }

    @Test public void newWithTwoArgs() {
        Node classUnderTest = new Node("A", "B");
        assertEquals("A", classUnderTest.getData());
        assertEquals("B", classUnderTest.getChildOne());
        assertEquals(null, classUnderTest.getChildTwo());	
    }
    
}
