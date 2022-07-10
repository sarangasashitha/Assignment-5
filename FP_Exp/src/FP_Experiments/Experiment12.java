package FP_Experiments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Experiment12 {
	  class ERemover implements Function<String, String> {
		    public String apply(String name) {
		      return name.replaceAll("e", "");
		    }
		  }
		  
		  public void run() {
		    String[] n1 = { "Chester", "Mike", "Wayne" };

		    List<String> n2 = Arrays.asList(n1);

		    n2.stream().map(new ERemover()).forEach(name -> System.out.println(name));

		  }

		  public static void main(String[] args) {
		    new Experiment12().run();
		  }
}
