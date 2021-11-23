package A5Polymorphism.A2Exercises.A2VehiclesExtension;

import java.text.DecimalFormat;

public abstract class VehicleImp implements Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private final double tankCapacity;

    public VehicleImp(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        setFuelConsumption(fuelConsumption);
        this.tankCapacity = tankCapacity;

    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }


    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String drive(double distance) {
        double fuelNeeded = fuelConsumption * distance;
        if(fuelNeeded > getFuelQuantity()){
            return this.getClass().getSimpleName() + " needs refueling";
        }
        setFuelQuantity(getFuelQuantity() - fuelNeeded);
        DecimalFormat formatter = new DecimalFormat("##.##");
        return String.format("%s travelled %s km",this.getClass().getSimpleName(),formatter.format(distance));
    }

    @Override
    public void refuel(double liters) {
        if(liters <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        double newFuelQuantity = this.fuelQuantity + liters;
        if(newFuelQuantity > this.tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }else {
            this.fuelQuantity += liters;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
