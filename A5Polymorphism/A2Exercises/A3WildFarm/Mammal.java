package A5Polymorphism.A2Exercises.A3WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private final String livingRegion;


    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %d]", getAnimalType(), getAnimalName(), format.format(getAnimalWeight()), this.livingRegion, getFoodEaten());
    }

}
