package designpattrens.strategy.payment;

public class CODPayment implements CODPaymentInterface {
    private int amount;
    public  CODPayment(int amount){
        this.amount = amount;
    }

    @Override
    public boolean pay() {
        System.out.println("COD Payment");
        return false;
    }
}
