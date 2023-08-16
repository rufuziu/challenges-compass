import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static String name;
  private static int numbProb;
  private static void resetVars(){
    name = "";
    numbProb = 0;
  }
  private static boolean checkInput(String inpu) {
    name = inpu.replaceAll("[^0-9]", "");
    if (name.length() == 1) {
      try {
        numbProb =
                Integer.parseInt(inpu.replaceAll("[^0-9]", ""));
      } catch (Exception e) {
        resetVars();
        return false;
      }
      if (numbProb > 0 && numbProb <= 9) {
        name = inpu.replaceAll("[^a-z]", "");
        return !name.isEmpty() && name.length() <= 20;
      }
    }
    else {
      resetVars();
      return false;
    }
    return false;
  }
  private static void printStudent(Student s) {
    System.out.print("Instancia ");
    System.out.print(s.getId());
    System.out.println();
    System.out.print(s.getName());
    System.out.print(" ");
    System.out.print(s.getProblemsSolved());
    //remove on last commit
    System.out.println();
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = 0;
    while (x < 2 || x >= 100) {
      try {
        x = Integer.parseInt(scanner.nextLine());
      } catch (Exception ex) {
        x = 0;
      }
    }
    if (x >= 2 && x <= 100) {
      List<Student> stu = new ArrayList<>();
      String input;
      while (x != 0) {
        input = scanner.nextLine().trim();
        if (checkInput(input)) {
          stu.add(new Student(name, numbProb));
          resetVars();
          x--;
        }
      }
      for (Student s : stu) {
        printStudent(s);
      }
    }
  }
}