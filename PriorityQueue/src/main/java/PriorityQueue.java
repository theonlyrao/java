import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

class PriorityQueue {
    private static final Map<String, Integer> alphabet;
    static {
	Map<String, Integer> myMap = new HashMap<String, Integer>();
	myMap.put("A", 1);
	myMap.put("B", 2);
	alphabet = Collections.unmodifiableMap(myMap);
    }

    Node[] nodes;

    public PriorityQueue(String unorderedString){
	String original = unorderedString;
	int len = original.length();

	String[] originalChars = new String[len];
	for (int i = 0; i < len; i++) {
	    originalChars[i] = Character.toString(original.charAt(i));
	}

	nodes = new Node[len];
	for (int i = 0; i < len; i++){
	    nodes[i] = this.makeNode(originalChars[i], Arrays.copyOfRange(originalChars, i + 1, len));
	}
    }

    public Node makeNode(String data, String[] characters){
	Node node = new Node(null);
	if (characters.length == 0) {
	    node = new Node(data, null, null);
	} else {
	    String childOne = characters[0];
	    node = new Node(data, childOne, null);
	}
	return node;
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

