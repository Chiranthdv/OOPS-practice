package Polymorphism;

public class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();   // Dog barks
        a = new Cat();
        a.sound();   // Cat meows
    }
} 
//“Runtime polymorphism is achieved using method overriding, 
// where subclass provides its own implementation. 
// The method call is resolved at runtime using dynamic method dispatch.”
