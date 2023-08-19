# challenges-compass

1 -  only additions and subtractions

2 - 1 < m < 100 ( m = input )

3 - 
    Xi = operand (0 <= Xi <= 100)
    sj = operator '+' or '-' (1<= j < m)

    formula:  result = Xi sj .. Xm-1 sm-1 Xm

4 - while m != 0 

    if m = 0

        Test 1
        result

        Test 2
        result



//version 1
package src;

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
          if(op.charAt(0)=='-') M++;
          op = op.replaceAll(" ", "");
          String str = op.replaceAll("[0-9]", "");
          if (M == str.length()) {
            str = op;
            str = str.replaceAll("[+]", " ");
            str = str.replaceAll("-", " -").trim();

            String[] numbers = str.split(" ");
            int plusCounter =0;
            int minusCounter =0;
            for (String n : numbers) {
              int num = Integer.parseInt(n);
              if (num >= 0) {
                plusCounter++;
              }
              else{
                minusCounter++;
              }
            }
            int[] positive = new int[plusCounter];
            int[] negative = new int[minusCounter];
            int index = 0;
            for (String n : numbers
            ) {
              int num = Integer.parseInt(n);
              if (num >= 0) {
                positive[index] = num;
                index++;
              }
            }
            index = 0;

            for (String n : numbers
            ) {
              int num = Integer.parseInt(n);
              if (num < 0) {
                negative[index] = num;
                index++;
              }
            }
            System.out.println("POSITIVES");
            for(int i : positive){
              System.out.print(i + " ");
            }
            System.out.println("\nNEGATIVES");
            for(int i : negative){
              System.out.print(i + " ");
            }
          }
        }


        //System.out.println("STR:  "+ str);
        //String[] operators = numbers.split("");
        // String[] operands = op.split("[+-]");
        // for (String o: operators
        // ) {
        //   System.out.println(o);
        //  }

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


      } catch (Exception e) {

      }
    }
  }
}
/*
      String op = scanner.nextLine();
      if(!op.isEmpty()){
        Calculator.Calculate(op,m);
      }
    }

 */
