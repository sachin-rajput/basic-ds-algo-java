/**
 * 
 */
package util;

/**
 * @author sachin
 * 
 */
public interface DynamicListStructure {

	public void add(Object data);

	public Object retrieve(String key);

	public boolean delete(String key);
}
