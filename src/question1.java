//Question :: Create a Vehicle parent class and extend it with Car and Bike using Polymorphism in your code.

abstract class Vehicle{
    private String brand;
    public static int noOfVehicles=0;
    //constructor
    Vehicle(String brand){
        this.brand = brand;
        noOfVehicles++;
    }
    String getDetails(){
        return brand;
    }

    abstract void printDetails();
}
class Car extends Vehicle{
    private String color;
    Car(String brand,String color){
        super(brand);
        this.color = color;
    }
    @Override
    void printDetails(){
        System.out.println(getDetails()+ " Car of "+ color + " color");
    }
}
class Bike extends Vehicle{
    private String type;
    Bike(String brand,String type){
        super(brand);
        this.type = type;
    }
    @Override
    void printDetails(){
        System.out.println(type + " " + getDetails()+ " Bike ");
    }

}

public class question1{
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("BMW","BLACK");
        vehicles[1] = new Bike("BMW","Sports");
        vehicles[2] = new Car("AUDI","WHITE");
        for(int i = 0; i < vehicles.length; i++){
            vehicles[i].printDetails();
        }
        System.out.println(Vehicle.noOfVehicles);
    }
}
