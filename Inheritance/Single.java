class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}
public class Single {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle();
        v1.start();

        Car v2=new Car();
        v2.start();
        v2.drive();
    }   
}
