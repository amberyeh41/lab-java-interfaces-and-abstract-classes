public abstract class Car{
  private String vinNumber;
  private String make;
  private String model;
  private int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getInfo(){
    return  "vinNumber: "+ vinNumber
            + " make: " + make + " model: "
            +model+" mileage: "+mileage;
  }

}

public class Sedan extends Car {
  public Sedan(String vinNumber, String make, String model, int mileage) {
    super(vinNumber, make, model, mileage);
  }
}
public class UtilityVehicle extends Car{
  private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive= fourWheelDrive;
    }
}
public class Truck extends Car{
  private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }
}




void main() {

}