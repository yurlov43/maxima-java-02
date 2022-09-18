package org.example;

public class App
{
    public static void main( String[] args ){
        City kirov = new City("Kirov", 300);
        Transport auto = new Transport("auto", 40, 100, 10.5f);
        System.out.print(auto.getPrice(kirov));
    }
}
