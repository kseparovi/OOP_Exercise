package SeventhTask;

import java.util.Scanner;

public class InputCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        String repeat;

        do {
            System.out.println("Please enter a string: ");
            userInput = input.nextLine();
            System.out.println("You entered: " + userInput);

            System.out.println("Do you want to repeat the input? Enter 'y' for yes, any other key for no.");
            repeat = input.nextLine();

        } while ("y".equalsIgnoreCase(repeat));

        System.out.println("Izabrali ste izlaz iz programa!");
    }
}