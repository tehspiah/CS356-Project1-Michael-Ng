import java.util.HashMap;
import java.util.Random;

public class iClicker {

	public HashMap map;

	public iClicker() {
		map = new HashMap<Integer, String>();
	}

	/*
	 * Retrieves answers from the hash map
	 */
	public String getAnswer(int key) {
		return (String) map.get(key);
	}

	/*
	 * Adds answers along with key to the hash map
	 */
	public void addAnswer(int a, char c) {
		map.put(a, c);
	}

}
