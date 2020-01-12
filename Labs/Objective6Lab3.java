public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    int MAX = 20;
    boolean odd,even;

    System.out.println(counter + " is odd");

      while ( counter <= 19 ) {
          counter = counter + 1;
          if (counter % 2 == 0) {
          System.out.println( counter + " is even");
        }
        if (counter % 2 != 0) {
        System.out.println( counter + " is odd");
        }
      }
    }
}
//code works but doesn't show odd next to number 1..
