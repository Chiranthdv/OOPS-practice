package Abstraction.Coupling;
interface Payment{
    void pay();
}
class CreditPayment implements Payment{
    public void pay(){
        System.out.println("Payment done by Credit card Payment");
    }
}
class UPIPayment implements Payment{
    public void pay(){
         System.out.println("Payment done by UPI Payment");
    }
}
class Shopping{
    Payment payment;
    public Shopping(Payment payment){
        this.payment=payment;
    }
    public void makePayment(){
        payment.pay();
    }
}
public class LooseCoupling {
    public static void main(String[] args) {
        Shopping s1=new Shopping(new CreditPayment());
        s1.makePayment();
        Shopping s2=new Shopping(new UPIPayment());
        s2.makePayment();
    }
}

// interface Computer{
//     void code();
// }
// class Laptop implements Computer{
//     public void code(){
//         System.out.println("Code run and debugging");
//     }
// }
// class Desktop implements Computer{
//     public void code(){
//         System.out.println("Code run and debugging but in faster way");
//     }
// }
// class IDE implements Computer{
//     public void code(){
//         System.out.println("Code run debug in the IDE");
//     }
// }
// class Developer{
//     Computer computer;
//     public Developer(Computer computer){
//         this.computer=computer;
//     }
    
//     public void developApp(){
//        computer.code();
//     }
// }
// class Demo {
//     public static void main(String[] args){
        
//         Developer d1=new Developer(new Laptop());
//         d1.developApp();
//         Developer d2=new Developer(new Desktop());
//         d2.developApp();
//         Developer d3=new Developer(new IDE());
//         d3.developApp();
//     }
// }