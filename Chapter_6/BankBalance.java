import java.util.Scanner;

public class BankBalance {

    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        final double INTEREST_RATE = 0.03;
        int choice;

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        System.out.print("Do you want to see next year's balance?" +
                        "\nEnter 1 for yes or any other number for no >>  ");
        choice = input.nextInt();
        int year =  0 ;


        while(choice == 1){
            year++;
            balance += balance * INTEREST_RATE;
            System.out.print("After " +year+" year/s  at " + INTEREST_RATE + " interest rate, balance is " + balance + "\n");

            System.out.print("Do you want to see the balance at the end of  another year? " +
                             "\n Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
        }
        input.close();

    }


}
