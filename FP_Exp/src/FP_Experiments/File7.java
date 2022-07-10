package FP_Experiments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Optional;

public class File7 {
	public static void main(String[] args) throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("data/488.txt"));
		Optional<String> result= r.lines().reduce((left,right) -> left.concat("".concat(right)));
		
		if(result.isPresent())
			System.out.println("result is "+ result.get());
		else
			System.out.println("result not present");
		
		r.close();
	}
	

}
