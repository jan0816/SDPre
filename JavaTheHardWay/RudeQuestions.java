import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
  String name;
  int age;
  double weight, income;
  int minutes;
  Scanner keyboard = new Scanner(System.in);

  System.out.print( "Hello. What is your name? " );
  name = keyboard.next();

  System.out.print( "Hi, " + name + "! How old are you? " );
  age = keyboard.nextInt();

  System.out.println( "So you're " + age + ", eh? That's not very old." );
  System.out.print( "How much do you weigh, " + name + "? " );
  weight = keyboard.nextDouble();

  System.out.println( weight + "! Better keep that quiet!!" );
  System.out.print("Finally, what's your income, " + name + "? " );
  income = keyboard.nextDouble();

  System.out.print( "Hopefully that is " + income + " per hour" );
  System.out.println( " and not per year!" );

  System.out.println( " How many minutes did this take of your day? " );
  minutes = keyboard.nextInt();
  System.out.print( minutes + " minutes. That's not that much! ");

  System.out.print( "Well, thanks for answering my rude questions, " );
  System.out.println( name + "." );
  //The program doesn't blow up for me when I enter an integer value when it's expecting a double. I imagine because it can convert.
  //No it didn't blow up when I put a numeric value on a String. It converted.
  // I made the second, third and fourth questions blow up by putting Strings rather than an integer.

}
}
