package decorator;

import superclass.Drink;
import superclass.DrinkDecorator;

//price 6 yuan
public class MilkEve extends DrinkDecorator {

    private Drink drink;

    public MilkEve(Drink drink) {
        super("奶昔"+drink.getDrinkName());
        this.drink = drink;
    }

    @Override
    public double cost() {
        return 6 + drink.cost();
    }
}
