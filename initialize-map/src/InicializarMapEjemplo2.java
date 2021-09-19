import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InicializarMapEjemplo2 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "Mar");
		map.put(2, "Lago");
		map.put(3, "Rio");
		map.put(4, "Arroyo");

		Iterator i = map.keySet().iterator();
		Integer k = null;
		
		while(i.hasNext()) {
			k = Integer.valueOf((int)i.next());
			System.out.println("-> key: " + k.intValue() + " - value: " + map.get(k.intValue()));
		}
	}

}
