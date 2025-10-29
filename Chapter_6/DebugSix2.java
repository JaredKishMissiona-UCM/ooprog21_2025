import java.util.Scanner;

public class DebugSix2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char letter;
        int min;
        final int MAX = 122;
        final int NUMBERLINE = 20;
        int lines = 0;

        System.out.println("Enter a Unicode value to start.");
        System.out.print("For example, A is 65 >> ");
        min = keyboard.nextInt();

        for (int a = min; a <= MAX; a++) {
            letter = (char) a;
            System.out.print(" " + letter);
            lines++;

            if (lines == NUMBERLINE) {
                System.out.println(); // move to next line
                lines = 0;
            }
        }

        System.out.println("\nEnd of application");
        keyboard.close();
    }
}
