import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    File testFile = new File("resources\\testFile.txt");
    try (Scanner scanner = new Scanner(new File("resources\\testFile.txt"))) {
      while (scanner.hasNextLine()) {
        try {
          String m = scanner.nextLine();
          int M = Integer.parseInt(m);
          if (M == 0) break;
          else if (!(M < 0) && !(M > 100)) {
            String op = scanner.nextLine();
            Calculator.Calculate(M, op);
          }
        } catch (Exception e) {
        }
      }
      Calculator.showMemory();
    } catch (FileNotFoundException e) {
      Scanner scanner = new Scanner(System.in);
      while (true) {
        try {
          String m = scanner.nextLine();
          int M = Integer.parseInt(m);
          if (M == 0) break;
          else if (!(M < 0) && !(M > 100)) {
            String op = scanner.nextLine();
            Calculator.Calculate(M, op);
          }
        } catch (Exception ex) {}
      }
      Calculator.showMemory();
    }
  }
}