/* 
   Program to calculate the volume and surface area of a
   right circular cylinder.      
   Programmer: cunderhill, File Name: lab_1.java 
*/

package lab_1;
import java.util.Scanner;
/
 *
 * @author colbyu
 */
public class Lab_1 {
 
    public static void main(String args[]) {
        // introduce a Scanner class object
        Scanner sc = new Scanner(System.in);

        // declare and initialize the variables
        // modified by colbyu 09-09-2016:
        double area = 0, height = 0, radius = 0, volume = 0, rsquared = 0;
        //original: double height = 0, radius = 0, volume = 0;
        String strName = "";

        // greet the program user	
        System.out.println("Welcome to the Volume Program!");
        // prompt user for their name
        System.out.println("please enter your name");
        // read the user name
        strName = sc.nextLine();
        //display the name back to the user
        System.out.println("hello " + strName);
	     
        // input: assign values to the variables	
        System.out.print("Please enter the radius. ");
        radius = sc.nextDouble(); 
        System.out.print("Please enter the height. ");
        height = sc.nextDouble();
        // for calculating surface area, added by cunderhill 09-09-16
        rsquared = Math.pow(radius, 2);
        
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
}
