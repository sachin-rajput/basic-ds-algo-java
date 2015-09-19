/**
 * 
 */
package types;

import linkedlist.SingleLinkedList;
import util.DynamicListStructure;
import util.HashEntry;

/**
 * @author sachin
 * 
 */
public class ChainingHashTable {
	public static int SIZE = 7;
	DynamicListStructure[] table;

	
	public ChainingHashTable() {
		table = new DynamicListStructure[SIZE];
		for (int i = 0; i < table.length; i++) {
			table[i] = new SingleLinkedList();
		}
	}

	public int code(String key) {
		return (Math.abs(key.hashCode()) % SIZE);
	}

	
	public void add(Object data) {
		HashEntry objData = (HashEntry)data;
		int code = this.code(objData.getKey().toString());
		table[code].add(data);
	}

	public Object retrieve(String key) {
		int code = this.code(key);
		return table[code].retrieve(key);
	}

	public boolean delete(String key) {
		int code = this.code(key);
		return table[code].delete(key);
	}
}
