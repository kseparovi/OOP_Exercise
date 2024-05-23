package ThirdTask;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first integer number: ");
        int firstNumber = input.nextInt();

        if (firstNumber == 0) {
            System.out.println("You have entered 0. Please enter a non-zero number.");
        } else if (firstNumber < 0) {
            System.out.println("You have entered a negative number. Please enter a positive number.");
        } else {
            System.out.println("You have entered an integer number.");
        }

        System.out.println("Please enter the second integer number: ");
        int secondNumber = input.nextInt();

        if (secondNumber == 0) {
            System.out.println("You have entered 0. Please enter a non-zero number.");
        } else if (secondNumber < 0) {
            System.out.println("You have entered a negative number. Please enter a positive number.");
        } else {
            System.out.println("You entered wrong input. Please enter a positive number.");
        }

        System.out.println("Please choose the operation you want to perform (add, subtract, multiply, divide, modulo): ");
        String operation = input.next();



        switch (operation) {
            case "add":
                System.out.println("The sum of the two numbers is: " + (firstNumber + secondNumber));
                break;
            case "subtract":
                System.out.println("The difference of the two numbers is: " + (firstNumber - secondNumber));
                break;
            case "multiply":
                System.out.println("The product of the two numbers is: " + (firstNumber * secondNumber));
                break;
            case "divide":
                System.out.println("The division of the two numbers is: " + (firstNumber / secondNumber));
                break;
            case "modulo":
                System.out.println("The modulo of the two numbers is: " + (firstNumber % secondNumber));
                break;
            default:
                System.out.println("Invalid operation. Please choose from add, subtract, multiply, divide.");
        }


    }
}
