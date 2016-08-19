public class Node {
    private String data;
    private String childOne;
    private String childTwo;

    public Node(String givenData, String givenChildOne, String givenChildTwo){
	data = givenData;
	childOne = givenChildOne;
	childTwo = givenChildTwo;
    }

    public Node(String givenData, String givenChildOne){
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

    public String getChildOne(){
	return this.childOne;
    }

    public String getChildTwo(){
	return this.childTwo;
    }

    public String toString(){
	return (this.data + ", " + this.childOne + ", " + this.childTwo);
    }

}
