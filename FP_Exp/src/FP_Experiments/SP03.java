package FP_Experiments;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
public class SP03 {
  public static void main(String[] args) {
    List<StudentsPerformance> table = Arrays.asList(
    		new StudentsPerformance("male","group A","bachelor's degree","standard","none",75,60,80),
            new StudentsPerformance("female","group B","bachelor's degree","standard","none",72,72,74),
            new StudentsPerformance("female","group C","some college","standard","completed",69,90,88),
            new StudentsPerformance("female","group B","master's degree","standard","none",90,95,93),           
            new StudentsPerformance("male","group A","associate's degree","free/reduced","none",47,57,44),          
            new StudentsPerformance("male","group C","some college","standard","none",76,78,75),          
            new StudentsPerformance("female","group B","associate's degree","standard","none",71,83,78),         
            new StudentsPerformance("female","group B","some college","standard","completed",88,95,92),          
            new StudentsPerformance("male","group B","some college","free/reduced","none",40,43,39),           
            new StudentsPerformance("male","group D","high school","free/reduced","completed",64,64,67),           
            new StudentsPerformance("female","group B","high school","free/reduced","none",38,60,50),      
            new StudentsPerformance("male","group C","associate's degree","standard","none",58,54,52));

    OptionalInt min = table.stream().mapToInt(StudentsPerformance::getMathscore).min();
    if (min.isPresent()) {
      System.out.printf("Lowest mark is %d\n", min.getAsInt());
    } else {
      System.out.println("min failed");
    }
  }

}
