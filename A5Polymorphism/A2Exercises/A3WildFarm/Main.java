package A5Polymorphism.A2Exercises.A3WildFarm;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Animal> animals = new LinkedList<>();

        String data = scan.nextLine();

        while (!data.equals("End")) {
            String[] animalData = data.split("\\s+");
            Animal animal = newAnimal(animalData);
            String[] foodData = scan.nextLine().split("\\s+");
            Food food = newFood(foodData);

            animal.makeSound();
            try {
                animal.eat(food);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            animals.add(animal);
            data = scan.nextLine();
        }
        animals.forEach(System.out::println);
    }

    private static Animal newAnimal(String[] animalData) {
        String animalType = animalData[0];
        String animalName = animalData[1];
        double animalWeight = Double.parseDouble(animalData[2]);
        String animalLivingRegion = animalData[3];
        switch (animalType) {
            case "Cat":
                return new Cat(animalName, animalType, animalWeight, animalLivingRegion, animalData[4]);
            case "Mouse":
                return new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
            case "Tiger":
                return new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
            case "Zebra":
                return new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
            default:
                throw new IllegalArgumentException("No such animal ");
        }
    }

    private static Food newFood(String[] foodData) {
        String foodType = foodData[0];
        Integer quantity = Integer.parseInt(foodData[1]);
        if (foodType.equals("Meat")) {
            return new Meat(quantity);
        } else {
            return new Vegetable(quantity);
        }
    }
}
