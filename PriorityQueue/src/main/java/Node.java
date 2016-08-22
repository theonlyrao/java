public class Node {
    private String data;
    private Node childOne;
    private Node childTwo;

    public Node(String givenData, Node givenChildOne, Node givenChildTwo){
	data = givenData;
	childOne = givenChildOne;
	childTwo = givenChildTwo;
    }

    public Node(String givenData, Node givenChildOne){
	data = givenData;
	childOne = givenChildOne;
	childTwo = null;
    }

    public Node(String givenData){
	data = givenData;
	childOne = null;
	childTwo = null;
    }

    public String getData(){
	return this.data;
    }

    public Node getChildOne(){
	return this.childOne;
    }

    public void setChildOne(String newChildOne){
	Node childOne = new Node(newChildOne);
	this.childOne = childOne;
    }

    public Node getChildTwo(){
	return this.childTwo;
    }

    public void setChildTwo(String newChildTwo){
	Node childTwo = new Node(newChildTwo);
	this.childTwo = childTwo;
    }

    public String toString(){
	return (this.data + ", " + this.childOne + ", " + this.childTwo);
    }

}
