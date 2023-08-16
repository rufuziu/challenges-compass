public class Student {
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
  public int getProblemsSolved() {
    return this.problemsSolved;
  }
}
