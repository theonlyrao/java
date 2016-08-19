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
	    nodes[i] = this.makeNode(originalChars[i], Arrays.copyOfRange(originalChars, i, len));
	    System.out.println("Made node " + i);
	}
    }

    public Node makeNode(String data, String[] characters){
	Node node = new Node(data, characters[0]);
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

