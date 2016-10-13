/* 
   Program to calculate the volume and surface area of a
   right circular cylinder.      
   Programmer: cunderhill, File Name: lab_1.java 
*/
/* 
   input validation code source: various posts on
   StackOverflow and StackExchange
*/
package lab_1_val;
/**
 *
 * @author colby
 */
// introduce a Scanner class object
import java.util.Scanner;
public class Lab_1_val {

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        // declare and initialize the variables
        double area = 0, height = 0, radius = 0, volume = 0, rsquared = 0;
        // for calculating surface area, added by cunderhill 09-09-16
        rsquared = Math.pow(radius, 2);
        //original: double height = 0, radius = 0, volume = 0;
        String strName = "";
        boolean isNumber = false;
        
        // greet the program user	
        System.out.println("Welcome to the Volume Program!");
        // prompt user for their name
        System.out.println("please enter your name");
        // read the user name
        strName = sc.nextLine();
        //display the name back to the user
        System.out.println("hello " + strName);
	     
        // input: assign values to the variables
        System.out.println("Please enter the radius. ");
        do {
            if (input.hasNextDouble()) {
                radius = input.nextDouble();
                isNumber = true;
            } else {
                System.out.println("That's not a number, dumbass, try again. ");
                isNumber = false;
                input.next();
            }

        } while (!(isNumber));

        System.out.println("Please enter the height. ");
        do {
            if (input.hasNextDouble()) {
                height = input.nextDouble();
                isNumber = true;
            } else {
                System.out.println("That's not a number, dumbass, try again. ");
                isNumber = false;
                input.next();
            } 

        } while (!(isNumber));
// process: compute the required quantity
        volume = 3.1416 * radius * radius * height;
        // area added by colbyu 09-09-2016:
        area = 2 * 3.1416 * radius * height + 2 * 3.1416 * rsquared;
   
        // output: display the output to the user
        System.out.print("The volume of the cylinder is: ");
        System.out.print(volume);
        System.out.println(" cubic length units, " + strName);
        // area added by colbyu 09-09-2016:
        System.out.print("And the area of the cylinder is: ");
        System.out.print(area);
        System.out.println(" square length units, " + strName);
      
        // dismiss the Scanner class object
        sc.close();
        }