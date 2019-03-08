package subclass;

import superclass.Drink;

//price 12 yuan
public class LemonTea extends Drink {

    public LemonTea(String drinkName){
        super(drinkName);
    }
    @Override
    public double cost() {
        return 12;
    }
}
