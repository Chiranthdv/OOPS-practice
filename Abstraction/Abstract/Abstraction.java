package Abstraction.Abstract;

abstract class Vehicle {
    abstract void drive();
    void startEngine() {
        System.out.println("Engine started");
    }
    void stopEngine() {
        System.out.println("Engine stopped");
    }
}
class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Car drives using a steering wheel");
    }
}
class Bike extends Vehicle {
    @Override
    void drive() {
        System.out.println("Bike drives using a handlebar");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        car.drive();
        car.stopEngine();
        Vehicle bike = new Bike();
        bike.startEngine();
        bike.drive();
        bike.stopEngine();
    }
}
