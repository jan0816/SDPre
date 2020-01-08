public class ClubBouncer {
  public static void main( String[] args ) {
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
      System.out.println("You are allowed to enter the club.");
    }
    else {
      System.out.println("You are not allowed to enter the club.");
    }
  }
 }
//If I put something between lines 10 and 11, it won't compile because it is breaking up the if statement body that my "else" statement needs to register with.
