import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();

    while (true) {
      // get input
      System.out.println("Calculator");
      System.out.println("Enter command:");
      String command = scanner.nextLine();
      String[] words = command.split("\\s+");

      // add
      if (words[0].equals("add")) {
        int n1 = Integer.parseInt(words[1]);
        int n2 = Integer.parseInt(words[2]);
        int answer = calculator.add(n1, n2);
        System.out.println(answer);
      }

      // subtract
      else if (words[0].equals("sub")) {
        int n1 = Integer.parseInt(words[1]);
        int n2 = Integer.parseInt(words[2]);
        int answer = calculator.subtract(n1, n2);
        System.out.println(answer);
      }

      // multiply
      else if (words[0].equals("mul")) {
        int n1 = Integer.parseInt(words[1]);
        int n2 = Integer.parseInt(words[2]);
        int answer = calculator.multiply(n1, n2);
        System.out.println(answer);
      }

      // divide
      else if (words[0].equals("div")) {
        int n1 = Integer.parseInt(words[1]);
        int n2 = Integer.parseInt(words[2]);
        int answer = calculator.divide(n1, n2);
        System.out.println(answer);
      }

      // fibonacci
      else if (words[0].equals("fib")) {
        int n = Integer.parseInt(words[1]);
        int answer = calculator.fibonacciNumberFinder(n);
        System.out.println(answer);
      }

      // intToBin
      else if (words[0].equals("ib")) {
        int n = Integer.parseInt(words[1]);
        String answer = calculator.intToBinaryNumber(n);
        System.out.println(answer);
      }

      // quit
      else if (words[0].equals("q") || words[0].equals("quit")) {
        System.out.println("goodbye.");
        break;
      }
      else {
        System.out.println("q or quit to quit");
      }

    }
  }
}
