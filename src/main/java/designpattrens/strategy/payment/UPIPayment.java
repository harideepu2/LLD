package designpattrens.strategy.payment;

public class UPIPayment implements PaymentInterface {
    private String upi_id;
    public  UPIPayment(String upi_id){
        this.upi_id = upi_id;
    }

    @Override
    public boolean pay() {
        System.out.println("UPI Payment "+ upi_id);
        return false;
    }
}
