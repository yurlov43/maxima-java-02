package org.example;

public class App
{
    public static void main( String[] args ){
        City kirov = new City("Kirov", 300);
        Truck truck = new Truck("truck", 12, 65, 34.6f);
        Ship ship = new Ship("ship", 23, 43, 45.6f);
        Plane plane = new Plane("plane", 54, 23, 65.6f);
        Logistics logistics = new Logistics(truck, ship, plane);
        ship.startRepair();
        ship.finishRepair();
        Transport suitableVehicle = logistics.getShipping(kirov, 10, 5);
        if(suitableVehicle != null) {
            System.out.println(suitableVehicle.getName());
        } else {
            System.out.println("There is no suitable vehicle!");
        }
    }
}
