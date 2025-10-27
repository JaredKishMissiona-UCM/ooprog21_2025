import java.util.Scanner;

public class CodingBankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double initialBalance = input.nextDouble();

        // Interest rates: 2%, 3%, 4%, 5%
        double[] interestRates = {0.02, 0.03, 0.04, 0.05};

        for (double rate : interestRates) {
            double balance = initialBalance;

            System.out.printf("%nWith an initial balance of $%.2f at an interest rate of %.2f%n",
                    initialBalance, rate);

            for (int year = 1; year <= 4; year++) {
                balance = balance * (1 + rate);
                System.out.printf("After year %d balance is $%.4f%n", year, balance);
            }
        }

        input.close();
    }
}

