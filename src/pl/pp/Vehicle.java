package pl.pp;

public abstract class Vehicle {

    protected String registrationNumber;
    protected String vinNumber;
    protected String color;
    protected double price;
    protected double fuelConsumption;
    protected double fuelLevel;
    protected double mileage;
    protected FuelType fuelType;

    public Vehicle(String registrationNumber, String vinNumber, String color,
                   double price, double fuelConsumption, double fuelLevel,
                   double mileage, FuelType fuelType) {

        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
        this.fuelType = fuelType;
    }

    public void drive(double distance) {
        double neededFuel = (distance / 100) * fuelConsumption;

        if (fuelLevel >= neededFuel) {
            fuelLevel = fuelLevel - neededFuel;
            mileage = mileage + distance;

            System.out.println("The vehicle drove " + distance + " km.");
        } else {
            System.out.println("Not enough fuel to drive " + distance + " km.");
        }
    }

    public void refuel(double amount) {
        fuelLevel = fuelLevel + amount;
        System.out.println("The vehicle was refueled with " + amount + " liters.");
    }

    public void showInfo() {
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("VIN number: " + vinNumber);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Fuel consumption: " + fuelConsumption);
        System.out.println("Fuel level: " + fuelLevel);
        System.out.println("Mileage: " + mileage);
        System.out.println("Fuel type: " + fuelType.getFuelType());
    }
}