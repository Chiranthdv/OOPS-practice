package Abstraction.Abstract;

abstract class Animal {
    String name;
    public Animal() {
        this("Unknown");
    }
    public Animal(String name) {
        this.name = name;
    }
    abstract void sound();
    public void eat() {
        System.out.println(name + " is eating");
    }
}
class Dog extends Animal {
    public Dog() {
        this("Unknown");
    }
    public Dog(String name) {
        super(name);
    }
    @Override
    public void sound() {
        System.out.println(name + " barks");
    }
}
class Cat extends Animal {
    public Cat() {
        this("Unknown");
    }
    public Cat(String name) {
        super(name);
    }
    @Override
    public void sound() {
        System.out.println(name + " meows");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Animal a = new Dog("Tommy");
        a.sound();
        a.eat();
        //abstraction achieved here now the type is animal and the functionality is sound so it is showing only functionality but 
        //it hide the implementation of the sound means it will implemented in the child class.
        Animal b = new Cat("Kitty");
        b.sound();
        b.eat();
    }
}