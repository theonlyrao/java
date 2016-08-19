import org.junit.Test;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class PriorityQueueTest {
    // @Test public void insert() {
    //     PriorityQueue classUnderTest = new PriorityQueue("PRIORITY");
    // 	assertThat(classUnderTest.min()).isInstanceOf(Node.class);
    // 	assertThat(classUnderTest.min().getData()).isEqualTo("I");
    // }
    
    // @Test public void insert() {
    //     PriorityQueue classUnderTest = new PriorityQueue("PRIORITY");
    //     assertEquals("IOPRRTY", classUnderTest.deleteMin());
    // }

    @Test public void trivialMakeNode() {
	PriorityQueue classUnderTest = new PriorityQueue("test");
	String[] chars = new String[1];
	chars[0] = "B";

	Node aNode = classUnderTest.makeNode("A", chars);
	assertEquals("A", aNode.getData());
	assertEquals("B", aNode.getChildOne());
	assertEquals(null, aNode.getChildTwo());
    }

    @Test public void priorityQueueExists() {
	PriorityQueue classUnderTest = new PriorityQueue("AB");

	assertThat(classUnderTest.nodes[0]).isInstanceOf(Node.class);
	assertThat(classUnderTest.nodes[1]).isInstanceOf(Node.class);		
	assertEquals(classUnderTest.nodes[0].getData(), "A");
	assertEquals(classUnderTest.nodes[0].getChildOne(), "B");	
	assertEquals("B", classUnderTest.nodes[1].getData());
	assertEquals(null, classUnderTest.nodes[1].getChildOne());	
    }
    
}
