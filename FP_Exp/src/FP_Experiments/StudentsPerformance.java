package FP_Experiments;
 
public class StudentsPerformance implements Comparable<StudentsPerformance> {
  private String gender;
  private String race;
  private String education;
  private String lunch;
  private String testpreparation;
  private int mathscore;
  private int readingscore;
  private int writingscore;
  
  public StudentsPerformance(String gender, String race,String education,String lunch,
		  String testpreparation, int mathscore, int readingscore, int writingscore
      ) {
    this.gender = gender;
    this.race = race;
    this.education = education;
    this.lunch = lunch;
    this.testpreparation = testpreparation;
    this.mathscore = mathscore;
    this.readingscore = readingscore;
    this.writingscore = writingscore;
   
  }

  public String toString() {
    return String.format("%-20s%-20s%-20s%-20s%-20s%10d%10d%10d", gender, race, education, lunch, testpreparation,mathscore,readingscore,writingscore);
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public String getEducation() {
    return education;
  }

  public void setEduaction(String education) {
    this.education = education;
  }

  public String getTestpreparation() {
    return testpreparation;
  }

  public void setTestprepaeration(String testpreparation) {
    this.testpreparation = testpreparation;
  }
  
  public int getMathscore() {
    return mathscore;
  }

  public void setMathscore(int mathscore) {
    this.mathscore = mathscore;
  }

  public int getReadingscore() {
	 return readingscore;
}

  public void setReadingscore(int readingscore) {
	 this.readingscore = readingscore;
}

  public int getWritingscore() {
	    return writingscore;
}

    public void setWritingcore(int writingscore) {
	    this.writingscore = writingscore;
}

    public int compareTo(StudentsPerformance c) {
        return ((Integer) mathscore).compareTo(c.mathscore);
      }
}
