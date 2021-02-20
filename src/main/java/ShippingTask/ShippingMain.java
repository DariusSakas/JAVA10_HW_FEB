package ShippingTask;

import java.util.Locale;
import java.util.Scanner;

public class ShippingMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Product firstProduct = new Product("Kebab");

        Shipping airShipping = new AirShipping();
        Shipping groundShipping = new AirShipping();
        Shipping seaShipping = new AirShipping();



        String choiceValue;
        do {

            System.out.println("Prees A for Air Shipping");
            System.out.println("Prees B for Ground Shipping");
            System.out.println("Prees C for Sea Shipping");

            choiceValue = scanner.nextLine().toLowerCase(Locale.ROOT);

            switch (choiceValue) {
                case "a":
                    airShipping.ship(firstProduct);
                    break;
                case "b":
                    groundShipping.ship(firstProduct);
                    break;
                case "c":
                    seaShipping.ship(firstProduct);
                    break;

                default:
                    System.out.println("No such option! Try again!");
            }

        } while (!choiceValue.equals("x"));
    }
}
