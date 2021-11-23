package A5Polymorphism.A2Exercises.A2VehiclesExtension;

public class Truck extends VehicleImp {
    private final double INCREASED = 1.6;
    private final double DIFFERENCE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption,double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + INCREASED);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * DIFFERENCE);
    }
}
