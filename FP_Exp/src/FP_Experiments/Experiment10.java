package FP_Experiments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Experiment10 {
	
	class EFilter implements Predicate<String>{
		public boolean test(String name) {
			return name.contains("e");
		}
	}
	
	public void run() {
		String[] n1 = {"Chester", "Mike", "Wayne"};
		
		List<String> n2 = Arrays.asList(n1);
		
		n2.stream().filter(new EFilter()).forEach(name -> System.out.println(name));
	}
	
	public static void main (String[] args) {
		new Experiment10().run();
	}

}
