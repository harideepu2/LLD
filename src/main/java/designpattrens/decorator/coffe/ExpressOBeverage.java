package designpattrens.decorator.coffe;

public class ExpressOBeverage implements Beverages{

    public ExpressOBeverage(){
        System.out.println("ExpressOBeverage");
    }
    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Coffe2";
    }
}
