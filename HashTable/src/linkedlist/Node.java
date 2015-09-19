/**
 * 
 */
package linkedlist;

/**
 * @author sachin
 *
 */
public class Node {
	Object data;
	Node next = null;
	
	public Node(Object dataIn){
		this.setData(dataIn);
	}
	
	public Node(){
		
	}
	
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
}
