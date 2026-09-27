package Abstraction.Coupling;
class CreditPayment{
    public void pay(){
        System.out.println("Payment done by Credit card Payment");
    }
}
class UPIPayment{
    public void pay(){
         System.out.println("Payment done by UPI Payment");
    }
}
class Shopping{
    // CreditPayment payment=new CreditPayment();//first time
    UPIPayment payment=new UPIPayment(); // second time
    //third time with different method then i want to change the shopping class right
    //it is not good design -> Tight coupling
    public void makePayment(){
        payment.pay();
    }
}
public class TightCouple {
    public static void main(String[] args) {
        Shopping s1=new Shopping();
        s1.makePayment();
    }
}
