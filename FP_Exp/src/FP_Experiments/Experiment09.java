package FP_Experiments;

import java.util.Arrays;
import java.util.List;

public class Experiment09 {
	public void run() {
		String[] n1 = {"Chester", "Mike", "Wayne"};
		
		List<String> n2 = Arrays.asList(n1);
		
		/*
		 * use a Lambda to implement a predicate that filters
		 * out names that do not include an 'e' character
		 */
		
		n2.stream().filter(name -> name.contains("e"))
		.forEach(name -> System.out.println(name));
	}
	
	public static void main(String[] args) {
		new Experiment09().run();
	}

}
