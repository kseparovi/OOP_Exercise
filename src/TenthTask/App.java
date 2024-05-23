package TenthTask;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kako ste danas: ");
        String unos = sc.next();
        switch (unos) {
            case "dobro":
                System.out.println("Hvala, danas sam:  " + unos);
                break;
            case "bolje":
                System.out.println("Hvala, danas sam:  " + unos);
                break;
            case "najbolji":
                System.out.println("Hvala, danas sam: " + unos);
                break;
            default:
                System.out.println("Sigurno će biti bolje");
        }


    }


}
