package driver;

import stacks.Stack;


public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stackObj = new Stack(10);
		stackObj.push(12);
		stackObj.push(13);
		stackObj.push(14);
		stackObj.push(15);
		
		stackObj.pop();
		stackObj.pop();
		stackObj.push("ssachin");
		System.out.println(stackObj.peek());
	}

}
