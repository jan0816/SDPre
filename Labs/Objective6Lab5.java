import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = keyboard.nextInt();

      switch (selection) {
        case 1: System.out.println("Hello World");
          break;
        case 2: System.out.println( "Apple, Banana, Coconut" );
          break;
        case 3: System.out.println( "Goodbye");
        keyboard.close();
        return;
      }
    }
  }
}
