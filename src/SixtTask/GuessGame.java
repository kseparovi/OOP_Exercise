package SixtTask;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please guess the right number: ");
        int val;

        do {
            val = input.nextInt();
            System.out.println("Your guess is: " + val );

        }
        while (val != 310);

        System.out.println("You entered right number");

    }

}
