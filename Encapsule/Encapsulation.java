package Encapsule;
class BankAccount {

    private double balance;
    // I intentionally did not provide a setter for balance because it would allow external code to modify the 
    // account balance directly, violating business rules. Instead, I expose domain-specific methods like deposit() 
    // and withdraw(), which perform validation before updating the balance. This is a better example of encapsulation 
    // because the object's internal state can only change through controlled operations.
    // Most senior developers would keep:
    //     if(amount > 0) directly.
    //     DRY doesn't mean:"Remove every repeated line."
    //     DRY means: "Don't duplicate significant business logic."
    private boolean isValidAmount(double amount){
        return amount>0;
    }
    public BankAccount(double amount){
        if(isValidAmount(amount))
            balance=amount;
    }
    public void deposit(double amount) {
        if(isValidAmount(amount)) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if(isValidAmount(amount) && amount <= balance) {
            balance -= amount;
        }
    }
    public double getBalance() {
        return balance;
    }
}


// class BankAccount  {
//     private double balance;
//     private int pin;
//     public BankAccount(double balance, int pin) {
//         this.balance = balance;
//         this.pin = pin;
//     }
//     private void setBalance(double balance) {
//         this.balance = balance;
//     }
//     private boolean validatePin(int enteredPin) {
//         return this.pin == enteredPin;
//     }
//     public void deposit(double amount){
//         try {
//             if (amount > 0) {
//                 //this.balance += amount;
//                 setBalance(this.balance+amount);//only bank employee can do update the balance it is internal work
//                 System.out.println("Amount deposited successfully");
//             } else {
//                 throw new IllegalArgumentException("Invalid amount for deposit");
//             }
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
//     public void withDraw(double amount, int enteredPin) {
//         try {
//             if (!validatePin(enteredPin)) {
//                 throw new IllegalArgumentException("Incorrect PIN");
//             }
//             if (amount > 0 && amount <= balance) {
//                 //this.balance -= amount;
//                 setBalance(this.balance-amount);
//                 System.out.println("Withdraw successful");
//             } else {
//                 throw new IllegalArgumentException("Invalid amount for withdraw");
//             }
//         }catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
//     public void checkBalance(int enteredPin) {
//         try {
//             if (!validatePin(enteredPin)) {
//                 throw new IllegalArgumentException("Incorrect PIN");
//             }
//             System.out.println("Current Balance: " + this.balance);
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }
// public class Encapsulation{
//     public static void main(String[] args) {
//         BankAccount a1=new BankAccount(800,12345);
       
//         a1.deposit(1000);
//         a1.checkBalance(12345);
//         a1.withDraw(500,12345);
//         a1.checkBalance(1234);
//         a1.checkBalance(12345);
//     }
// }

//to more secure use the pincode during the account creation and get balance and amount withdraw time

//Simple example becuase of time constraints then tell about this
// class Student {
//     private String name;
//     private int marks;

//     public void setName(String name) {
//         this.name = name;
//     }
//     public void setMarks(int marks) {
//         if (marks >= 0 && marks <= 100) {
//             this.marks = marks;
//         } else {
//             System.out.println("Invalid marks");
//         }
//     }
//     public String getName() {
//         return name;
//     }
//     public int getMarks() {
//         return marks;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.setName("Chiranth");
//         s1.setMarks(85);
//         System.out.println("Name: " + s1.getName());
//         System.out.println("Marks: " + s1.getMarks());
//     }
// }