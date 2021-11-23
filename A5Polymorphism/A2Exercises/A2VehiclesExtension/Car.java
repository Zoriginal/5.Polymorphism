package A5Polymorphism.A2Exercises.A2VehiclesExtension;

public class Car extends VehicleImp {
    private final double INCREASED = 0.9;

    public Car(double fuelQuantity, double fuelConsumption,double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + INCREASED);
    }
}
