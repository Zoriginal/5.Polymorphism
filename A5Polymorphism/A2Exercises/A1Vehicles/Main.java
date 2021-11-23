package A5Polymorphism.A2Exercises.A1Vehicles;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] carData = scan.nextLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carData[1]),Double.parseDouble(carData[2]));

        String[] truckData = scan.nextLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(truckData[1]),Double.parseDouble(truckData[2]));


        Map<String,Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car",car);
        vehicleMap.put("Truck",truck);

        int number = Integer.parseInt(scan.nextLine());

        while (number-->0){
            String[] command = scan.nextLine().split("\\s+");
            switch (command[0]){
                case "Drive":
                    System.out.println(vehicleMap.get(command[1]).drive(Double.parseDouble(command[2])));
                    break;
                case "Refuel":
                    vehicleMap.get(command[1]).refuel(Double.parseDouble(command[2]));
                    break;
            }
        }
        for (Vehicle vehicle : vehicleMap.values()) {
            System.out.println(vehicle.toString());
        }
    }
}
