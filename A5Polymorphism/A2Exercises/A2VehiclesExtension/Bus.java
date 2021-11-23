package A5Polymorphism.A2Exercises.A2VehiclesExtension;

public class Bus extends VehicleImp{

    private final double INCREASED = 1.4;
    private boolean isEmpty;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption,tankCapacity);
        this.isEmpty = true;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        if (isEmpty){
            super.setFuelConsumption(fuelConsumption);
        }
        super.setFuelConsumption(fuelConsumption + INCREASED);
    }
}
