public class Objective4Lab2 {
  public static void main(String[] args) {
    String string1 = "Banana";
    String string2 = "Bacon";
    String string3 = "Banana";

    if(string1.equals(string2) ) {
      System.out.println(string1 + " is equivalent to " + string2);
    }
    else {
      System.out.println(string1 + " is not equivalent to " + string2 );
      System.out.println(string1 + " is equivalent to " + string3 );
    }
  }
}
//This code works to show what the expected output is supposed to say but not sure if I'm determining if string1 is equivalent to string3.
