package FP_Experiments;

import java.util.Arrays;
import java.util.List;

public class Experiment05 {
	
	public static void main(String[] args) {
		//TOO Auto-generated method stub
		String[] n1 = {"Chester", "Mike", "Wayne"};
		
		/*
		 * for (String name:n1){
		 * System.out.println(name);
		 * }
		 */
		List<String> n2 = Arrays.asList(n1);
		n2.forEach(name -> System.out.println(name));
	}
	

}
