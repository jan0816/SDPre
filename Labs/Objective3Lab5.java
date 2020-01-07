import java.util.Scanner;

public class Objective3Lab5{
  public static void main(String [] args ){
    int number;
    int another;
    double c;

    Scanner input = new Scanner(System.in);
    number = 0;
    another = 0;
    c = 0;

    System.out.print( "Please enter a number: " );
    number = input.nextInt();
    System.out.print( "Please enter another number: " );
    another = input.nextInt();

    c = number + another;
    System.out.print("The sum of " + number + " " + " +  " + another  + " = " + c );
    c = input.nextDouble();

  }
}
