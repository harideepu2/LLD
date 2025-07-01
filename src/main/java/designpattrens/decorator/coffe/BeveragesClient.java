package designpattrens.decorator.coffe;

public class BeveragesClient {

    public static void main(String[] args) {
        Beverages capaccion = new MilkDecorator(new CapaccinoBaverage());
        System.out.println(capaccion.getCost());
        System.out.println(capaccion.getDescription());

        Beverages latte = new ChoclateDecorator(new LatteBeverage());
        System.out.println(latte.getCost());
        System.out.println(latte.getDescription());
    }
}
