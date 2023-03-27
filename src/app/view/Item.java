package app.view;

import app.services.Validate;

import java.util.Scanner;

public class Item {

    public static byte getOptionCoffee() {
        System.out.println("""
                 Choose a drink:
                 -----------------------
                 1 - Espresso
                 2 - Cappuccino
                 3 - Latte
                 0 - Exit
                 -----------------------
                """);
        Scanner scanner = new Scanner(System.in);
        return Validate.validateOptionInput(scanner, "[0-3]", "Try again entered option value:");
    }

}
