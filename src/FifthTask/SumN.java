package FifthTask;

//size:32 min:-2147483648          max:2147483647

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sum = 0;
        while (sum < 2147483647 && sum > -2147483648) {
            System.out.println("Please enter the number n: ");
            int n = input.nextInt();
            for (int i = 1; i <= n; i++) {
                if (sum + i < 2147483647 && sum + i > -2147483648) {
                    System.out.println("Suma prvih n prirodnih brojeva je prevelika za tip int.");
                    return;
                }
                sum += i;
            }
            System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
        }
    }
}