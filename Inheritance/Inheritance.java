class Vehicle{
    public void start(){
        System.out.println("Vehicle is started");
    }   
    public void stop(){
        System.out.println("Vehicle is stoped");
    }
}
class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car is started with the keys");
    }
    public void drive(){
        System.out.println("Car is driving with steering wheel.");
    }
}
class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bike is started with Kicker");
    }
    public void drive(){
        System.out.println("Bike is driving through the handles");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        
        Car c1=new Car();
        c1.start();
        c1.stop();  
        c1.drive();
        Bike v2=new Bike();
        v2.start();
        v2.stop();
        v2.drive();
    }    
}
