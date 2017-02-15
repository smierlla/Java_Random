
/**
 * Write a description of class Driver here.
 this driver class  has the main method , which is going to run the UnitPriceConverter class and
 do the calculations for the user
 *
 * @author (Sebastian Mier Llanos)
 * @version (9/21/2015)
 */
import java.util.Scanner;
public class Driver
{
    public static void main (String [] args) {


   UnitPriceConverter food ; // this  is the reference variable for  the unitpriceconverter class

   // local variables
   double price;
   double weight;
   char Repeat;
   Scanner input; // reference variable for scanner

   // creates the scanner object
   input = new Scanner (System.in);

   // creates the unit price converter object
    food = new UnitPriceConverter();

    // this variable will be used in the while loop
    Repeat = 'y';


    /* this loop will ask the user all the questions about the item's
    he has one by one. if user has more than one item he will be asked
    to press "y" each time he wants to calculate a new item
    once he has calculated all the items he wants, user can then press any keyboard
    exept for "y" to exit the program.
    */
    while (Repeat == 'y' || Repeat == 'Y')
    {

    System.out.println(" please enter the Price of the item you choosed: ");
    price = input.nextDouble();
    food.setPriceOfItem(price);


    System.out.println("please enter the total weight in pounds , of the item  you choosed: ");
    weight = input.nextDouble();
    food.setWeightInPounds(weight);

    System.out.println(" the price per pound for this item you choosed is: " + food.getpricePerpound());
    System.out.println(" the price per ounce for this item you choosed is: " + food.getpricePerOunce());

    System.out.println("enter y to calculate the price of the next item");
    Repeat = input.next().charAt(0);
} // end  the loop

System.out.println(" Goodbye and thank you for using this measuring tool!");
} // end of main
} // end of class
