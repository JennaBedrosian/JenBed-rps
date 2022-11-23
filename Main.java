import garage.*;

import java.util.*;

public class Main {

    private ArrayList<Vehicle> garage = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void parkVehicle (Vehicle vehicle) {
        garage.add(vehicle);
    }

    public void unParkVehicle (Vehicle vehicle) {
        garage.remove(vehicle);
    }

    public List<Vehicle> listVehicleByType (String vehicleType) {
        switch (vehicleType) {
            case "Car": return getAllCars();
            case "Boat": return getAllBoats();
            case "Bus": return getAllBuses();
            case "MotorCycle": return getAllMotorCycles();
            case "Airplane": return getAllAirplanes();
            default: return Collections.EMPTY_LIST;
        }

    }

    public Vehicle getVehicleByRegNo(String regNo){
        Vehicle foundVehicle = null;
        for (Vehicle vehicle : garage) {
            if (vehicle.getRegNo().equals(regNo)){
                foundVehicle = vehicle;

            }
        }
        return foundVehicle;
    }

    private List<Vehicle> getAllCars() {
        List<Vehicle> foundVehicles = new ArrayList<>();
        for (Vehicle vehicle : garage) {
            if (vehicle instanceof Car){
                foundVehicles.add(vehicle);
            }
        }
        return foundVehicles;
    }

    private List<Vehicle> getAllBoats() {
        List<Vehicle> foundVehicles = new ArrayList<>();
        for (Vehicle vehicle : garage) {
            if (vehicle instanceof Boat){
                foundVehicles.add(vehicle);
            }
        }
        return foundVehicles;
    }

    private List<Vehicle> getAllBuses() {
        List<Vehicle> foundVehicles = new ArrayList<>();
        for (Vehicle vehicle : garage) {
            if (vehicle instanceof Bus){
                foundVehicles.add(vehicle);
            }
        }
        return foundVehicles;
    }

    private List<Vehicle> getAllMotorCycles() {
        List<Vehicle> foundVehicles = new ArrayList<>();
        for (Vehicle vehicle : garage) {
            if (vehicle instanceof MotorCycle){
                foundVehicles.add(vehicle);
            }
        }
        return foundVehicles;
    }

    private List<Vehicle> getAllAirplanes() {
        List<Vehicle> foundVehicles = new ArrayList<>();
        for (Vehicle vehicle : garage) {
            if (vehicle instanceof Airplane){
                foundVehicles.add(vehicle);
            }
        }
        return foundVehicles;
    }

}
