import decorator.MilkEve;
import decorator.Mocha;
import subclass.LemonTea;
import superclass.Drink;

public class Main {

    public static void main(String[] args) {

        Drink drink1 = new MilkEve(new Mocha(new LemonTea("柠檬")));
        String s = "your order " + drink1.getDrinkName() +"cost " + drink1.cost() + " yuan! \n";
        System.out.print(s);

        Drink drink2 = new Mocha(new LemonTea("柠檬"));
        String s1 = "your order " + drink2.getDrinkName() +" cost " + drink2.cost() + " yuan!\n";


        System.out.print(s1);

    }
}
