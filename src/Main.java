
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  week = scanner.nextLine();

        switch (week){
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;

            case "Wendsday":
                System.out.println("Today is Wendsday");
                break;

            case "Thursday":
                System.out.println("Today is Thursday ");
                break;
            case "friday":
                System.out.println("Today is friday ");
                break;
            case "Saturday":
                System.out.println("Today is Saturday ");
                break;
            case "Sunday":
                System.out.println("Today is Sunday ");
                break;

            default:
        }

    }
}