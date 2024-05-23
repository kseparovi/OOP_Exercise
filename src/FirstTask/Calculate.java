package FirstTask;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int cube = (int) pow(firstNumber, 3);
        int square = (int) pow(secondNumber, 2);

        System.out.println("Cube of the input numbers is: " + cube + " and square of the input numbers is: " + square);


    }





}
