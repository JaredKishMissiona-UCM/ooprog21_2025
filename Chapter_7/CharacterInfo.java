import java.util.Scanner;

public class CharacterInfo {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);

        System.out.printf("%nThe character is %c%n", character);
        if(Character.isUpperCase(character)) {
            System.out.println(character + " is  uppercase");
            System.out.println(character + " is  not lowercase");
        }
        else if (Character.isWhitespace(character)) {
            System.out.println("You entered a whitespace character.");
        }

        char newCharacter = Character.toLowerCase(character);
        System.out.printf("After toLowerCase(), aChar is %c%n", newCharacter);

        char upperCaseCharacter = Character.toUpperCase(character);
        System.out.printf("After toUpperCase(), aChar is %c%n", upperCaseCharacter);

        System.out.printf(upperCaseCharacter + " is a letter or digit\n"
                        + upperCaseCharacter + " is not whitespace");


    }
}
