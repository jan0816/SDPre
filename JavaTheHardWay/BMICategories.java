import java.util.Scanner;

public class BMICategories {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double  m, kg, ft, totalin, bmi, in, lb;

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
    System.out.print( "Your BMI is " + bmi + "\n");

    System.out.print( "BMI category: " );
    if ( bmi < 15.0 ) {
      System.out.println( "very severely underweight" );
    }
    else if ( bmi <= 16.0 ) {
      System.out.println( "severely underweight" );
    }
    else if ( bmi < 18.5 ) {
      System.out.println( "underweight" );
    }
    if ( bmi < 25.0 ) {
      System.out.println( "normal weight" );
    }
    else if ( bmi < 30.0 ) {
      System.out.println( "overweight" );
    }
    else if ( bmi < 35.0 ) {
      System.out.println( "moderately obese" );
    }
  }
}
