package designpattrens.strategy.payment;

/*
* Context
* Stragey Interface
* Concrete Startegy
*
* */
public class PaymentClient {
    public PaymentClient(){

    }
    public void executePayment(String payment_type){
        if(payment_type == "upi"){
            PaymentStrategyContext upi  = new PaymentStrategyContext(new UPIPayment("name@upi"));
            upi.pay(100);
        }
        else if(payment_type == "cc"){
            PaymentStrategyContext cc = new PaymentStrategyContext(new CreditcardPayment("123456","000","07/29"));
            cc.pay(200);
        }
        else if(payment_type == "net"){
            PaymentStrategyContext net = new PaymentStrategyContext(new NetBankingPayment("user","1234"));
            net.pay(200);
        }
    }

    public static void main(String[] args) {
        PaymentClient pc = new PaymentClient();
        pc.executePayment("upi");
    }
}
