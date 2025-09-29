// This class uses a DebugPen class
// to instantiate two Pen objects
// One with default values
// and the other with user-supplied values

import java.util.Scanner;

public class DebugFour2
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String color;
        String point;
        DebugPen pen1;
        DebugPen pen2;

        System.out.print("Enter a color ink for the pen >> ");
        color = input.nextLine();

        System.out.print("Enter a point size - fine, medium, or thick >> ");
        point = input.nextLine();

        pen1 = new DebugPen();
        pen2 = new DebugPen(point, color);

        System.out.println("Default value pen:");
        display(pen1);

        System.out.println("User value pen:");
        // FIX 1: Changed 'pen22' to the correctly named variable 'pen2'
        display(pen2); 
        
        input.close(); // Good practice to close the Scanner
    }

    // FIX 2 & 3: Changed the parameter type to 'DebugPen' 
    // and fixed the parameter name used inside the method body from 'p1' to 'p'.
    public static void display(DebugPen p) 
    {
        System.out.println("The pen has ink color " + p.getColor());
        System.out.println("and a " + p.getPoint() + " point.");
    }
}