package pl.pp;

public class RentalTest {

    public static void main(String[] args) {

        FuelType diesel = new DieselEngine();
        FuelType gasoline = new GasolineEngine();
        FuelType electric = new ElectricEngine();

        PassengerCar car = new PassengerCar(
                "ABC123",
                "VIN111222333",
                "Black",
                50000,
                6.5,
                40,
                12000,
                gasoline,
                5
        );

        Truck truck = new Truck(
                "TRK456",
                "VIN444555666",
                "White",
                120000,
                15.0,
                100,
                50000,
                diesel,
                8000
        );

        Motorcycle motorcycle = new Motorcycle(
                "MOTO789",
                "VIN777888999",
                "Red",
                20000,
                4.0,
                15,
                8000,
                gasoline,
                false
        );

        ConstructionEquipment equipment = new ConstructionEquipment(
                "CON123",
                "VIN000111222",
                "Yellow",
                250000,
                20.0,
                150,
                3000,
                diesel,
                900
        );

        System.out.println("Passenger car information:");
        car.showInfo();
        car.drive(100);
        car.refuel(20);

        System.out.println();

        System.out.println("Truck information:");
        truck.showInfo();
        truck.drive(200);
        truck.refuel(50);

        System.out.println();

        System.out.println("Motorcycle information:");
        motorcycle.showInfo();
        motorcycle.drive(50);
        motorcycle.refuel(10);

        System.out.println();

        System.out.println("Construction equipment information:");
        equipment.showInfo();
        equipment.drive(30);
        equipment.refuel(40);
    }
}