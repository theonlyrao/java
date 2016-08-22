import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
    @Test public void newWithThreeArgs() {
	Node bNode = new Node("B");
        Node classUnderTest = new Node("A", bNode, null);
        assertEquals("A", classUnderTest.getData());
        assertEquals("B", classUnderTest.getChildOne().getData());
        assertEquals(null, classUnderTest.getChildTwo());	
    }

    @Test public void newWithOneArg() {
        Node classUnderTest = new Node("A");
        assertEquals("A", classUnderTest.getData());
        assertEquals(null, classUnderTest.getChildOne());
        assertEquals(null, classUnderTest.getChildTwo());	
    }

    @Test public void newWithTwoArgs() {
	Node bNode = new Node("B");	
        Node classUnderTest = new Node("A", bNode);
        assertEquals("A", classUnderTest.getData());
        assertEquals("B", classUnderTest.getChildOne().getData());
        assertEquals(null, classUnderTest.getChildTwo());	
    }
    
}
