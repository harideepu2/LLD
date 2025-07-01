package designpattrens.decorator.coffe;

public class MilkDecorator implements Beverages{
    private Beverages beverage;
    public MilkDecorator(Beverages beverage){
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() +20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +" + Milk1" ;
    }
}
