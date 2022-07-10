package FP_Experiments;

import java.util.Arrays;
import java.util.List;

public class Experiment08 {
	public void run() {
		String[] n1 = {"Chester", "Mike", "Wayne"};
		
		List<String> n2 = Arrays.asList(n1);
		
		System.out.println("Serial name\n--------");
		n2.stream().forEach(name -> System.out.println(name));
		
		System.out.println("\nParallel names\n--------");
		n2.parallelStream().forEach(name -> System.out.print(name));
	}
	
	public static void main(String[] args) {
		new Experiment08().run();
	}

}
