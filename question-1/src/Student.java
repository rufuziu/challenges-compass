public class Student implements Comparable<Student> {
  private static int k = 0;
  private int id;
  private String name;
  private int problemsSolved;
  public Student(String name, int probSolv) {
    this.name = name;
    this.problemsSolved = probSolv;
    this.id = getK();
    setK();
  }
  private int getK() {
    return Student.k;
  }
  private void setK() {
    Student.k++;
  }
  public int getId() {
    return this.id;
  }
  public String getName() {
    return this.name;
  }
  public int getProblemsSolved() { return this.problemsSolved; }
  @Override
  public int compareTo(Student o) {
    int x = this.getProblemsSolved() - o.getProblemsSolved();
    if(x > 0){
      return this.getName().compareTo(o.getName());
    }
    else{
      return o.getName().compareTo(this.getName());
    }
  }
}