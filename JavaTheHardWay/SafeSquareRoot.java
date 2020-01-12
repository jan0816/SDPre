import java.util.Scanner;

public class SafeSquareRoot {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String go = "yes";
    String userready = "";

    System.out.print(" Are you ready?!? ");

    while (!userready.equals(go)) {
      userready = keyboard.next();
        if (!userready.equals(go)) {
        System.out.print( "Come on!\n" );
        System.out.print( "Are you ready now?!? " );
      }
    }

    System.out.print("Give me a number, and I'll find it's square root. ");
    System.out.print("(No negatives, please.) ");
    x = keyboard.nextDouble();

    while ( x < 0 ) {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of "+x+" is "+y);
  }
 }
