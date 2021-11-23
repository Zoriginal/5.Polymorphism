package A5Polymorphism.A2Exercises.A2VehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] vehicleData = scan.nextLine().split("\\s+");
        Vehicle car = setVehicle(vehicleData);

        vehicleData = scan.nextLine().split("\\s+");
        Vehicle truck = setVehicle(vehicleData);

        vehicleData = scan.nextLine().split("\\s+");
        Vehicle bus = setVehicle(vehicleData);

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car",car);
        vehicleMap.put("Truck",truck);
        vehicleMap.put("Bus",bus);

        int number = Integer.parseInt(scan.nextLine());

        while (number-->0){
            String[] command = scan.nextLine().split("\\s+");
            switch (command[0]){
                case "Drive":
                    System.out.println(vehicleMap.get(command[1]).drive(Double.parseDouble(command[2])));
                    break;
                case "DriveEmpty":
                    if(vehicleMap.get(command[1]) instanceof Bus){
                        ((Bus) vehicleMap.get(command[1])).setEmpty(false);
                        System.out.println(vehicleMap.get(command[1]).drive(Double.parseDouble(command[2])));
                        ((Bus) vehicleMap.get(command[1])).setEmpty(true);
                    }
                    break;
                case "Refuel":
                    try {
                        vehicleMap.get(command[1]).refuel(Double.parseDouble(command[2]));
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
        vehicleMap.values().forEach(System.out::println);
    }
    private static Vehicle setVehicle(String[] data){
        String vehicleType = data[0];
        double fuelQuantity = Double.parseDouble(data[1]);
        double liters = Double.parseDouble(data[2]);
        double tankCapacity = Double.parseDouble(data[3]);
        Vehicle vehicle = null;
        switch (vehicleType){
            case "Car":
                vehicle = new Car(fuelQuantity,liters,tankCapacity);
                break;
            case "Truck":
                vehicle = new Truck(fuelQuantity,liters,tankCapacity);
                break;
            case "Bus":
                vehicle = new Bus(fuelQuantity,liters,tankCapacity);
                break;
        }
        return vehicle;
    }
}
