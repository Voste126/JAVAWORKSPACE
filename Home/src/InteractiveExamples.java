/* An interactive program is one that enables the user to interact with the keyboard 
 * in this example we must make availble the class scanner method available  and their we must import 
 * Written by Steve Austine 19th January 2024
 * 
*/
import java.util.Scanner;

public class InteractiveExamples {
    public static void main(String [] args){
        Scanner myInput = new Scanner(System.in);
        Short l = 20;
        Short w = 5;
        int Area = l * w;
        int Perimeter = 2*(l + w);
        // System.out.println("The Area of the rectangle is:\t" + Area);
        // System.out.println("The Perimeter of the rectagle is:\t" + Perimeter);

        // promting and enetering the values 
        System.out.println(" Enter the value of the Length of Rectangle \n");
        l = myInput.nextShort();
        System.out.println(" Enter the value of the Width \n");
        w = myInput.nextShort();
        Area = l * w;
        Perimeter = 2*(l + w);
        System.out.println("The Area of the rectangle is:\t" + Area);
        System.out.println("The Perimeter of the rectagle is:\t" + Perimeter);
    }//End of main function
}
