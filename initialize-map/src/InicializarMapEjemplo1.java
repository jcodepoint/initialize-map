import java.awt.Choice;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InicializarMapEjemplo1 {

	public static void main(String[] args) {

		List<Choice> choices = new ArrayList<Choice>();

		Choice choice = new Choice();
		choice.setName("Marcelo");
		choices.add(choice);
		
		Map<String, Choice> result =
			    choices.stream().collect(Collectors.toMap(Choice::getName,
			                                              Function.identity()));		
		
		System.out.println("-> keys: " + String.join(", ", result.keySet()));
		
		//System.out.println("-> values: " + String.join(", ", result.values()));
		
	}

}
