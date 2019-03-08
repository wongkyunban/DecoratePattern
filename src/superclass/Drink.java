package superclass;

public abstract class Drink {

    private String drinkName;
    public Drink(String drinkName){
        this.drinkName = drinkName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public abstract double cost();
}
