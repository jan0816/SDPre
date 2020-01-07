import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, ft, totalin, bmi, in, lb;

    System.out.print( "Your height (feet only): " );
    ft = keyboard.nextDouble();

    System.out.print( "Your height (inches): " );
    in = keyboard.nextDouble();
    totalin = ft*12 + in;
    m = totalin*0.0254;

    System.out.print( "Your weight in pounds: " );
    lb = keyboard.nextDouble();
    kg = lb*.453592;

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
 }
 }
