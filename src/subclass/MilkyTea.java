package subclass;

import superclass.Drink;
//price 10 yuan
public class MilkyTea extends Drink {

    public MilkyTea(String drinkName){
        super(drinkName);
    }


    @Override
    public double cost() {
        return 10;
    }
}
