package SecondTask;

import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Please choose the operation you want to perform (add, subtract, multiply, divide): ");
        String operation = input.next();

        if (operation.equals("add")) {
            System.out.println("The sum of the two numbers is: " + (firstNumber + secondNumber));
        } else if (operation.equals("subtract")) {
            System.out.println("The difference of the two numbers is: " + (firstNumber - secondNumber));
        } else if (operation.equals("multiply")) {
            System.out.println("The product of the two numbers is: " + (firstNumber * secondNumber));
        } else if (operation.equals("divide")) {
            System.out.println("The division of the two numbers is: " + (firstNumber / secondNumber));
        } else {
            System.out.println("Invalid operation. Please choose from add, subtract, multiply, divide.");
        }



    }
}
