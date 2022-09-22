package org.example;

public class App
{
    public static void main( String[] args ){
        City kirov = new City("Kirov", 300);
        Transport auto = new Transport("auto", 40, 100, 10.5f);
        Truck truck = new Truck("truck", 12, 65, 34.6f);
        Ship ship = new Ship("ship", 23, 43, 45.6f);
        Plane plane = new Plane("plane", 54, 23, 65.6f);
        System.out.println(truck.getPrice(kirov));
        System.out.println(ship.getPrice(kirov));
        System.out.println(plane.getPrice(kirov));
    }
}
