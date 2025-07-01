package designpattrens.decorator.coffe;

public class CapaccinoBaverage implements Beverages{

    public CapaccinoBaverage(){
        System.out.println("CapaccinoBaverage");
    }
    @Override
    public int getCost() {
        return 300;
    }

    @Override
    public String getDescription() {
        return "Milk1 + coffe1";
    }
}
