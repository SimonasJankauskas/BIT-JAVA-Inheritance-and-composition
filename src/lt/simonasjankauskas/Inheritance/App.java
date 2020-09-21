package lt.simonasjankauskas.Inheritance;

public class App {
    public static void main(String[] args) {
    FuelType cars1 = new FuelType("Porsche", "Macan Turbo", 315, "Petrol");
        System.out.println(cars1);
    }
}
class Cars {
    private String carName;
    private String carModel;
    private int topSpeed;

    public Cars () {}

        public Cars (String carName, String carModel, int topSpeed) {
            this.carName = carName;
            this.carModel = carModel;
            this.topSpeed = topSpeed;

        }

    @Override
    public String toString() {
        return
                "Car name: " + carName +
                ", \nCar model: " + carModel  +
                ", \nTop speed: " + topSpeed + "km/h"
                ;
    }
}
class FuelType extends Cars {
    private String fuelType;
    public FuelType (String carName, String carModel, int topSpeed, String fuelType) {
        super(carName, carModel, topSpeed);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", \nFuel type: " + fuelType
                ;
    }
}





