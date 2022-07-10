package FP_Experiments;

import java.io.BufferedReader;
import java.io.FileReader;

public class File3 {
	public static void main(String[] args)throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("data/488.txt"));
		r.lines().filter(l-> l.contains("his")).forEach(l -> System.out.println(l));
		r.close();
	}

}
