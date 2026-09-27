// class Engine{
//     public void start(){
//         System.out.println("Engine is started");
//     }
// }
interface Engine{
    void start();
}   
// class Playmusic{
//     public void music(){
//         System.out.println("Music is playing");
//     }
// }
interface Playmusic{
    void music();
}
class Car implements Engine,Playmusic {
    //To start-> it require engine to start
    public void start(){
        System.out.println("Car engine is started");
    }
    //to playmusic -> it require to on
    public void music(){
        System.out.println("Music is playing inside");
    }
    public void drive(){
        System.out.println("Car is driving");
    }
}
public class Multiple {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.start();
        c1.music();
        c1.drive();
    }
}

// interface ElectricVehicle {
//     void charge();
// }
// interface GPS {
//     void showLocation();
// }
// class ElectricCar implements ElectricVehicle, GPS {
//     public void charge() {
//         System.out.println("Electric car is charging");
//     }
//     public void showLocation() {
//         System.out.println("Electric car location is shown");
//     }
//     public void drive() {
//         System.out.println("Electric car is driving");
//     }
// }
// public class MultipleVehicleDemo {
//     public static void main(String[] args) {
//         ElectricCar e1 = new ElectricCar();
//         e1.charge();
//         e1.showLocation();
//         e1.drive();
//     }
//}