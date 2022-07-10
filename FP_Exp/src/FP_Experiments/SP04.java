package FP_Experiments;
import java.util.*;
public class SP04 {
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

    System.out.println("Several students have 40 mark");
    table.stream().filter(StudentsPerformance -> StudentsPerformance.getMathscore() == 40)
        .forEach(System.out::println);

    System.out.println();
    System.out.println("studenst with 47 mark");
    table.stream().filter(StudentsPerformance -> StudentsPerformance.getMathscore() == 47)
        .forEach(System.out::println);

  }
}
