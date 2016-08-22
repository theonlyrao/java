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

	nodes = new Node[1];
	
	int i = 0;
	Node firstNode = new Node(originalChars[i]);
	String childOne = originalChars[i+1];
	String childTwo = originalChars[i+2];		
	nodes[0] = this.makeNode(firstNode, childOne, childTwo);
	
	while (i < len){
	    if (i+2 < len) {
		nodes[0] = this.makeQueue(firstNode, originalChars, i);
		i++;
	    } else if (i+1 < len) {
		String childOne = originalChars[i+1];
		String childTwo = null;
		nodes[0] = this.makeQueue(firstNode, childOne, childTwo);
		i++;
	    } else {
		String childOne = null;
		String childTwo = null;
		nodes[0] = this.makeQueue(firstNode, childOne, childTwo);
		i++;
	    }

	}
	
    }

    public Node makeNode(Node firstNode, String childOne, String childTwo){
	firstNode.setChildOne(childOne);
	firstNode.setChildTwo(childTwo);
	return firstNode;
    }

    int j = 2;
    public Node makeQueue(Node firstNode, String[] originalChars, Integer i){
	firstNode.getChildOne().setChildOne(originalChars[i + j]);
	firstNode.getChildOne().setChildTwo(originalChars[i + j + 1]);
	firstNode.getChildTwo().setChildOne(originalChars[i + j + 2]);
	firstNode.getChildTwo().setChildTwo(originalChars[i + j + 3]);
	this.makeQueue(firstNode.getChildOne().g)
    }
    
}

