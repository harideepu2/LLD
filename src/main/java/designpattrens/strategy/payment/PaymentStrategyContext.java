package designpattrens.strategy.payment;

public class PaymentStrategyContext {
    private PaymentInterface paymentintf;
//    private  CODPaymentInterface paymentintf;
    public PaymentStrategyContext(PaymentInterface paymentintf){
        this.paymentintf = paymentintf;
    }
//    public PaymentStrategyContext(CODPaymentInterface paymentintf){
//        this.paymentintf = paymentintf;
//    }
    public void pay(int amount){
        paymentintf.pay();
    }
}
