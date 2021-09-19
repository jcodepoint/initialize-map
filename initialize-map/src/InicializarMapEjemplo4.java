import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InicializarMapEjemplo4 {

	public static void main(String[] args) {
		Map<Integer, String> map = Stream.of(
				new AbstractMap.SimpleEntry<Integer, String>(1, "Mar"), 
				new AbstractMap.SimpleEntry<Integer, String>(2, "Lago"),
				new AbstractMap.SimpleEntry<Integer, String>(3, "Rio"),
				new AbstractMap.SimpleEntry<Integer, String>(4, "Arroyo")
			).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		map.forEach((k, v) -> System.out.println("-> key: " + k + " - value: " + v));
	}

}
