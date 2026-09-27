class Vehicle{
    public void start(){
        System.out.println("Vehicle is started");
    }
    public void stop(){
        System.out.println("Vehicle is stopped");
    }
}
interface Fuel{
    void fuelAdded();
}
//take normal car
class Car extends Vehicle implements Fuel{

    public void drive(){
        System.out.println("Car is driving");
    }
    public void fuelAdded(){
        System.out.println("Fuel is added");
    }
}
interface ElectricCharge{
    void charge();
}
//we have the electric car
class ElectricCar extends Car implements ElectricCharge {
    public void charge(){
        System.out.println("Car is charging");
    }
}
public class Hybrid {
    public static void main(String[] args) {
        
    }
}
