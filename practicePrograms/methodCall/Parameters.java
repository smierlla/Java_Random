import java.util.Scanner;

/*
 this class will call a method called "message" from the class "call" and it will output
  the message that is on the method with the name the user decides to pass in
*/


  public class Parameters {
  public static void main(String [] args ){

    Scanner input = new Scanner(System.in);
    Call tom = new Call();
    System.out.println( " please enter your name");
    String name = input.nextLine();

    tom.message(name);
  }
}
