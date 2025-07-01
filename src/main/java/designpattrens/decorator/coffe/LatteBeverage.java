package designpattrens.decorator.coffe;

public class LatteBeverage implements Beverages{

    public LatteBeverage(){
        System.out.println("LatteBeverage");
    }
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "coffe1 + Milk2";
    }
}
