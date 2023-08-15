public class Student {
  static int k = 0;
  private int id;
  private String name;
  private int problemsSolved;

  public Student(String input) {
    this.name = input;
    this.problemsSolved = 0;
    this.id = getK();
    ++k;
  }

  static int getK() {
    return k;
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
