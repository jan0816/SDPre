import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      int num1 = 5;
      int num2 = 15;

    if(num1 > num2) {
      System.out.println( "5 is less than 15 ");
    }
    else if(num2 > num1) {
      System.out.println( "15 is greater than 5 " );
    }
  }
}
