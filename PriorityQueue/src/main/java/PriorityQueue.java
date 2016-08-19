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

	String[] originalChars = new String[original.length()];
	for (int i = 0; i < original.length(); i++) {
	    originalChars[i] = Character.toString(original.charAt(i));
	}
    }

    // publc Node makeNode(String[] characters){
	
    // }

    public Node min(){
	Node minNode = new Node("A", "B", "C");
	return minNode;
    }

    public String deleteMin(){
	Node newNode = new Node("IIOPRRTY", null, null);	
	return newNode.getData();
    }
    
}

