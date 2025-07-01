package designpattrens.strategy.payment;

public class NetBankingPayment implements PaymentInterface {
    private String username;
    private String password;
    public NetBankingPayment(String username, String password){
        this.username = username;
        this.password = password;
    }
    @Override
    public boolean pay(){
        System.out.println("Net Banking Payment");
        return true;
    }
}
