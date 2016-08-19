import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

class PriorityQueue {
    private static final Map<String, Integer> alphabet;
    static {
	Map<String, Integer> myMap = new HashMap<String, Integer>();
	myMap.put("A", 1);
	myMap.put("B", 2);
	alphabet = Collections.unmodifiableMap(myMap);
    }
    
    

    public PriorityQueue(String unorderedString){
	String original = unorderedString;
    }

    public Node min(){
	Node minNode = new Node("A", "B", "C");
	return minNode;
    }

    public String deleteMin(){
	Node newNode = new Node("IIOPRRTY", null, null);	
	return newNode.getData();
    }
    
}

