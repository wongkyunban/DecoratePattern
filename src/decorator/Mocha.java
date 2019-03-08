package decorator;

import superclass.Drink;
import superclass.DrinkDecorator;

/**
 * mocha 5 yuan
 */
public class Mocha extends DrinkDecorator {


    private Drink drink;
    public Mocha(Drink drink) {
        super("末茶"+drink.getDrinkName());
        this.drink = drink;

    }


    @Override
    public double cost() {
        if(drink != null) {
            return 5 + drink.cost();
        }else {
            return 5;
        }
    }
}
