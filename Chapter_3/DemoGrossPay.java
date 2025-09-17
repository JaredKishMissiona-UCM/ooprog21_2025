import java.util.Scanner;

public class DemoGrossPay {
    public static final double HOURLY_RATE = 22.75;

    public static void calculateGross(double hoursWorked) {
        double grossPay = hoursWorked * HOURLY_RATE;
        System.out.println(hoursWorked + " hours at $" 
                           + HOURLY_RATE + " per hour is $" 
                           + grossPay);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();
        
        calculateGross(hoursWorked);
        
        scanner.close();
    }
}
