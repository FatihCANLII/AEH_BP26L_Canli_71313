package pl.pp;

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(String registrationNumber, String vinNumber, String color,
                 double price, double fuelConsumption, double fuelLevel,
                 double mileage, FuelType fuelType, double loadCapacity) {

        super(registrationNumber, vinNumber, color, price, fuelConsumption,
                fuelLevel, mileage, fuelType);

        this.loadCapacity = loadCapacity;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Load capacity: " + loadCapacity + " kg");
    }
}