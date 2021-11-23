package A5Polymorphism.A2Exercises.A1Vehicles;

public class Truck extends VehicleImp{
    private final double INCREASED = 1.6;
    private final double DIFFERENCE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
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
    public void refuel(double liters) {
        super.refuel(liters * DIFFERENCE);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
