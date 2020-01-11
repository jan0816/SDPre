import java.util.Scanner;

 public class EnterPin {
 public static void main( String[] args ) {
 Scanner keyboard = new Scanner(System.in);
 int pin, entry;
 String password = "hunter2";
 String userentryforpw = "";
 pin = 12345;

 System.out.println("WELCOME TO THE BANK OF JAVA." + "\nPLEASE ENTER YOUR PASSWORD: ");

 while (!userentryforpw.equals("hunter2")) {
 userentryforpw = keyboard.next();
 if (!userentryforpw.equals("hunter2")) {
  System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
  System.out.print("ENTER YOUR PASSWORD: ");
 }
}

 System.out.print("ENTER YOUR PIN: ");
 entry = keyboard.nextInt();

 while ( entry != pin ) {
 System.out.println("\nINCORRECT PIN. TRY AGAIN.");
 System.out.print("ENTER YOUR PIN: ");
 entry = keyboard.nextInt();
 }

 System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
 }
}
