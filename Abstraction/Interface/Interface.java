package Abstraction.Interface;

abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Animal eats");
    }
}
interface Runnable{
    void run();
}
interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}
class Dog extends Animal implements Runnable{
    void sound() {
        System.out.println("Dog barks");
    }
    public void run(){
        System.out.println("Dog will run");
    }
}
class Duck extends Animal implements Runnable,Flyable, Swimmable {
    
    void sound() {
        System.out.println("Duck quacks");
    }
     public void run(){
        System.out.println("Duck run");
    }
    public void fly() {
        System.out.println("Duck flies");
    }
    public void swim() {
        System.out.println("Duck swims");
    }
}
public class Interface{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
        d1.sound();
        d1.run();
    }
}
