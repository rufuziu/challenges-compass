package Calculator;

import java.util.Map;

public class Calculator {
  private static int n = 1;
  Memory memory = new Memory();
  public static void Calculate(String operation, int m ){
    System.out.println(m + "  " +operation);
  };
}
