import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int num = 6;

    System.out.println( "Please enter a number: ");
    num = keyboard.nextInt();

    if(num % 2 == 0) {
      System.out.println( " The number is even" );
    }
    else if(num %2 != 0) {
      System.out.println( " The number is odd" );
    }
  }
}
