/**
 * 
 */
package util;

/**
 * @author sachin
 * 
 */
public class HashEntry {
	private String key;
	private String data;
	private boolean deleted;

	public HashEntry(String key, String data) {
		this.key = key;
		this.data = data;
		deleted = false;
	}

	public void setDeleted() {
		deleted = true;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public String getKey() {
		return key;
	}

	public String getData() {
		return data;
	}
}
