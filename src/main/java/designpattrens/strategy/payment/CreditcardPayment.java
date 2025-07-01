package designpattrens.strategy.payment;

public class CreditcardPayment implements PaymentInterface{
    private String num;
    private String cvv;
    private  String date;
    public CreditcardPayment(String num,String cvv,String date){
        this.num = num;
        this.cvv = cvv;
        this.date = date;
    }
    @Override
    public boolean pay() {
        System.out.println("Creditcard payment");
        return false;
    }
}
