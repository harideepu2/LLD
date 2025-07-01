package designpattrens.decorator.coffe;

public class ChoclateDecorator implements Beverages{
    private Beverages beverage;
    public ChoclateDecorator(Beverages beverage){
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() +30;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +" + Choclate1" ;
    }
}
