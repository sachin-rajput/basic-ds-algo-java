/**
 * 
 */
package base;

/**
 * @author sachin
 *
 */
public class Node {

	private Object data;
	
	private Node next = null;
	private Node prev = null;
	
	public Node(Object data){
		setData(data);
	}
	
	public Node(Object data,Node nextIn){
		setData(data);
		setNext(nextIn);
	}
	
	public Node(Object data,Node nextIn,Node prevIn){
		setData(data);
		setNext(nextIn);
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
	
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
	/**
	 * @return the next
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * @param next the next to set
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + this.getData() + "]";
	}
	
}
