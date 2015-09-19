/**
 * 
 */
package driver;

import linkedlist.Node;
import types.ChainingHashTable;
import types.LinearHashTable;
import util.HashEntry;

/**
 * @author sachin
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinearHashTable linearHT = new LinearHashTable();
		LinearHashTable.SIZE = 5;
		linearHT.add("1", "A");
		linearHT.add("2", "B");
		linearHT.add("3", "C");
		linearHT.add("4", "D");
		linearHT.add("4", "F");
		
		String lineardata1 = linearHT.retrieve("1");
		String lineardata2 = linearHT.retrieve("2");
		
		System.out.println("Linear data with key 1 retireved: "+ lineardata1);
		System.out.println("Linear data with key 2 retireved: "+ lineardata2);
		
		linearHT.delete("1");
		System.out.println("Linear data with key 1 deleted");
		
		lineardata1 = linearHT.retrieve("1");
		if(lineardata1.equals("deleted"))
			System.out.println("Linear data with key 1(deleted) retireved: "+ lineardata1);
		
		ChainingHashTable chainingHT = new ChainingHashTable();
		ChainingHashTable.SIZE = 5;
		chainingHT.add(new HashEntry("1","A"));
		chainingHT.add(new HashEntry("2","B"));
		chainingHT.add(new HashEntry("6","G"));
		chainingHT.add(new HashEntry("5","H"));
		chainingHT.add(new HashEntry("7","J"));
		
		Node chaindata1 = (Node)chainingHT.retrieve("1");
		Node chaindata2 = (Node)chainingHT.retrieve("6");
		
		System.out.println("Chaining data with key 1 retireved: "+ ((HashEntry)chaindata1.getData()).getData());
		System.out.println("Chaining data with key 2 retireved: "+ ((HashEntry)chaindata2.getData()).getData());
		
		chainingHT.delete("1");
		System.out.println("Chaining data with key 1 deleted");
		
		
	}

}
