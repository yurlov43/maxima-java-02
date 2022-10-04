package org.example;

public class App
{
    public static void main( String[] args ){
        City kirov = new City("Kirov", 300);
        Truck truck = new Truck("truck", 12, 65, 34.6f);
        Ship ship = new Ship("ship", 23, 43, 45.6f);
        Plane plane = new Plane("plane", 54, 23, 65.6f);
        System.out.println(truck.getPrice(kirov));
        System.out.println(ship.getPrice(kirov));
        System.out.println(plane.getPrice(kirov));
    }
}
