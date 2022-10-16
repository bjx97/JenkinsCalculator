import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();
    int counter = 0;
    label:
    while (true) {
      if (counter == 0) {
        System.out.println("Welcome to the Calculator");
        System.out.println("Enter a command:");
      }

      String command = scanner.nextLine();
      String[] words = command.split("\\s+");

      switch (words[0]) {
        case "add": {
          int number1=Integer.parseInt(words[1]);
          int number2=Integer.parseInt(words[2]);
          int answer=calculator.add(number1, number2);
          System.out.println(answer);
          counter++;
          break;
        }

        case "subtract": {
          int n1=Integer.parseInt(words[1]);
          int n2=Integer.parseInt(words[2]);
          int answer=calculator.subtract(n1, n2);
          System.out.println(answer);
          counter++;
          break;
        }

        case "multiply": {
          int n1=Integer.parseInt(words[1]);
          int n2=Integer.parseInt(words[2]);
          int answer=calculator.multiply(n1, n2);
          System.out.println(answer);
          counter++;
          break;
        }

        case "divide": {
          int n1=Integer.parseInt(words[1]);
          int n2=Integer.parseInt(words[2]);
          int answer=calculator.divide(n1, n2);
          System.out.println(answer);
          counter++;
          break;
        }

        case "fibonacci": {
          int number1=Integer.parseInt(words[1]);
          int answer=calculator.fibonacciNumberFinder(number1);
          System.out.println(answer);
          counter++;
          break;
        }

        case "binary": {
          int number1=Integer.parseInt(words[1]);
          String answer=calculator.intToBinaryNumber(number1);
          System.out.println(answer);
          counter++;
          break;
        }

        case "cancel":
        case "quit":
          break label;

        default:
          System.out.println("Enter add, subtract, multiply, divide, fibonacci, or intToBin as a command. " +
                  "Enter cancel or quit to exit the program.");
          counter++;
          break;
      }

    }
  }
}
