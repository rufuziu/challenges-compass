import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {
      try {
        String m = scanner.nextLine();
        int M = Integer.parseInt(m);
        if (M == 0) break;
        else if (!(M < 0) && !(M > 100)) {
          String op = scanner.nextLine();
          op = op.replaceAll(" ", "");
          String str = op.replaceAll("[0-9]", "");
          if (M == str.length()) {
          str = op;
          System.out.println("STR:  "+ str);
          }
          //String[] operators = numbers.split("");
          // String[] operands = op.split("[+-]");
          // for (String o: operators
          // ) {
          //   System.out.println(o);
          //  }
          //for (String p : operands
          // ) {
          //   System.out.println(p);
          // }
          //OK
          //op = op.replaceAll(" ","");
          //
          //int i =0;
          //int counter = 0;
          //while(true){
          //  int founder = op.indexOf("-", i);
          //  if (founder == -1)break;
          //  counter++;
          //  i = founder+1;
          // }
          // System.out.println(counter);
          // op = op.replaceAll("[+]"," ");
          // System.out.println(op);

        }
      } catch (Exception e) {

      }

/*
      String op = scanner.nextLine();
      if(!op.isEmpty()){
        Calculator.Calculate(op,m);
      }
    }

 */
    }
  }
}