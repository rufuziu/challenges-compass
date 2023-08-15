import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = Integer.parseInt(scanner.nextLine());
    List<Student> stu = new ArrayList<>();
    String input;
    while(x != 0){
      input = scanner.nextLine();
      stu.add(new Student(input));
      x--;
    }

    for(Student s : stu){
      System.out.print(s.getId());
      System.out.print(" ");
      System.out.print(s.getName());
      System.out.print(" ");
      System.out.print(s.getProblemsSolved());
      System.out.print("\n");
    }

  }
}