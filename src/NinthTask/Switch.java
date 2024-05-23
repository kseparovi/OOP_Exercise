package NinthTask;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite znak: ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 's': System.out.println("Case is: " + ch); break;
            case 'r': System.out.println("Case is: " + ch); break;
            case 'k': System.out.println("Case is: " + ch); break;
            default: System.out.println("Case is not a case!");
        }

    }
}