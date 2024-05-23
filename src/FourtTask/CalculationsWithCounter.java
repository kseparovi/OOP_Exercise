package FourtTask;

import java.util.Scanner;

public class CalculationsWithCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 0;

        while (radius < 10) {
            System.out.println("Please enter the radius of the sphere: ");
            radius = input.nextDouble();

            double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
            System.out.println("The volume of the sphere is: " + volume);
        }
    }
}