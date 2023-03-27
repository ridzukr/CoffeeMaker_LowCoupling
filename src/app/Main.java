package app;

import app.services.CoffeeMaker;
import app.view.Cappuccino;
import app.view.Espresso;
import app.view.Latte;
import app.view.Item;

public class Main {
    public static CoffeeMaker coffeeMaker;

    public static void main(String[] args) {
        coffeeMaker = new CoffeeMaker();
        startOption(Item.getOptionCoffee());
    }

    private static void startOption(byte option) {
        switch (option) {
            case 0 -> System.exit(0);
            case 1 -> coffeeMaker.setMaker(new Espresso());
            case 2 -> coffeeMaker.setMaker(new Cappuccino());
            case 3 -> coffeeMaker.setMaker(new Latte());
        }
        coffeeMaker.startMaker();
    }

}
