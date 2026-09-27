class Vehicle{
    public void startEngine(){
        System.out.println("Engine is started");
    }
    public void stopEngine(){
        System.out.println("Engine is stoped");
    }
}
class FourWheeler extends Vehicle{
    public void rotateSteering(){
        System.out.println("Rotate the steering");
    }
}
class Car extends FourWheeler{
    public void drive(){
        System.out.println("Car is driving with steering wheel");
    }
}
public class MuiltLevel {
    public static void main(String[] args) {
        
        Car c=new Car();
        c.startEngine();
        c.stopEngine();
        c.rotateSteering();
        c.drive();
    }
}

// class Vehicle {
//     public void start() {
//         System.out.println("Vehicle is started");
//     }
//     public void stop() {
//         System.out.println("Vehicle is stopped");
//     }
// }
// class Car extends Vehicle {
//     public void drive() {
//         System.out.println("Car is driving");
//     }
// }
// class SportsCar extends Car {
//     public void speed() {
//         System.out.println("Sports car runs very fast");
//     }
// }
// public class MultilevelDemo {
//     public static void main(String[] args) {
//         SportsCar s1 = new SportsCar();
//         s1.start();   // from Vehicle
//         s1.drive();   // from Car
//         s1.speed();   // from SportsCar
//         s1.stop();    // from Vehicle
//     }
// }