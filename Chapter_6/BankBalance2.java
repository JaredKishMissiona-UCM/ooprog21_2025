import java.util.Scanner;

public class BankBalance2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double INTEREST_RATE = 0.03;
        int choice;
        int year = 0;

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        do {
            year++;
            balance += balance * INTEREST_RATE;
            System.out.printf("After %d year/s at %.2f%% interest rate, balance is %.2f%n",
                    year, INTEREST_RATE * 100, balance);

            System.out.print("Do you want to see the balance at the end of another year? " +
                    "\nEnter 1 for yes or any other number for no >> ");
            choice = input.nextInt();

        } while (choice == 1);

        input.close();
        System.out.println("Thank you for using the bank balance calculator!");
    }
}
