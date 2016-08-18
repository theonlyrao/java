import org.junit.Test;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class PriorityQueueTest {
    @Test public void insert() {
        PriorityQueue classUnderTest = new PriorityQueue("PRIORITY");
	assertThat(classUnderTest.min()).isInstanceOf(Node.class);
	assertThat(classUnderTest.min().getData()).isEqualTo("I");
    }
    
    // @Test public void insert() {
    //     PriorityQueue classUnderTest = new PriorityQueue("PRIORITY");
    //     assertEquals("IOPRRTY", classUnderTest.deleteMin());
    // }
}
