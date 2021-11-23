package A5Polymorphism.A2Exercises.A1Vehicles;

public class Car extends VehicleImp{
    private final double INCREASED = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public double getFuelQuantity() {
        return super.getFuelQuantity();
    }

    @Override
    public double getFuelConsumption() {
        return super.getFuelConsumption();
    }

    @Override
    public void setFuelQuantity(double fuelQuantity) {
        super.setFuelQuantity(fuelQuantity);
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + INCREASED);
    }

    @Override
    public String drive(double distance) {
        return super.drive(distance);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
