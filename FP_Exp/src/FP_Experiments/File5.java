package FP_Experiments;

import java.io.BufferedReader;
import java.io.FileReader;

public class File5 {
	public static void main(String[] args)throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("data/488.txt"));
		r.lines()
		.sorted((a,b)->{
			if(a.length()== b.length())
				return 0;
			if(a.length()<b.length())
				return 1;
			return -1;
		})
		.forEach(l->System.out.println(l));
		r.close();
	}
}
