import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InicializarMapEjemplo5 {

	public static void main(String[] args) {

		Map<Integer, String> map =
				Stream.of(new Object[][] {
					{1, "Mar"}, 
					{2, "Lago"}, 
					{3, "Rio"},
					{4, "Arroyo"}
				}).collect(Collectors.toMap(a -> (Integer)a[0], a -> (String)a[1]));
		
		map.forEach((k, v) -> System.out.println("-> key: " + k + " - value: " + v));
	}

}
