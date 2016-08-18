public class Node {
    private String data;
    private String childOne;
    private String childTwo;

    public Node(String givenData, String givenChildOne, String givenChildTwo){
	data = givenData;
	childOne = givenChildOne;
	childTwo = givenChildTwo;
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

}
