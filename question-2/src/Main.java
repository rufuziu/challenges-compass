import java.util.Scanner;

public class Main {
  private static final String amused = ":-)";
  private static final String annoyed = ":-(";
  private static int feelingCounter = 0;

  private static void findEmoticon(String msg) {
    int i = 0;
    int j = msg.length();
    int founder;
    while (true) {
      founder = msg.indexOf(amused, i);
      if (founder == -1) break;
      feelingCounter++;
      i = founder + amused.length();
    }
    while (true) {
      founder = msg.lastIndexOf(annoyed, j);
      if (founder == -1) break;
      feelingCounter--;
      j = founder - amused.length();
    }
  }


  private static void expressSentiment() {
    if (feelingCounter == 0) System.out.print("neutral");
    else if (feelingCounter > 0) System.out.print("fun");
    else System.out.print("upset");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String msg = ":-):-):-):-)" +
            ":-):-(:-(:-)(:-(" +
            "(:-(:-((:-(";
    findEmoticon(msg);
    expressSentiment();
  }
}