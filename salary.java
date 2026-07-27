abstract class payment{
    protected double amount;
    payment(double amount){
        this.amount=amount;
    }
    abstract void pay();
    void receipt(){
        System.out.println("receipt generated");
        System.out.println("amount paid:"+amount);
    }
    void showpaymentstatus(){
        System.out.println("payment successful");
    }
}
class upipayment extends payment{
    private String upiid;
    upipayment(double amount,String upiid){
        super(amount);
        this.upiid=upiid;
    }
    @Override
    void pay(){
        System.out.println("processing upi payment...");
        System.out.println("upiid:"+upiid);
    }
}
class cardpayment extends payment{
    private String cardnumber;
    cardpayment(double amount,String cardnumber){
        super(amount);
        this.cardnumber=cardnumber;
    }
    @Override
    void pay(){
        System.out.println("processing cardpayment...");
        System.out.println("cardnumber:**** **** ****"+cardnumber.substring(cardnumber.length()-4));
    }
}
        public class Main{
            public static void main(String[] args){
                payment p1=new upipayment(550.75,"jeni@oksbi");
                payment p2=new cardpayment(1250.50,"1324567887654321");
                p1.pay();
                p1.receipt();
                p1.showpaymentstatus();
                System.out.println();
                p2.pay();
                p2.receipt();
                p2.showpaymentstatus();
            }
        }
