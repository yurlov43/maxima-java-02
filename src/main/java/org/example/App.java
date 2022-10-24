package org.example;

public class App
{
    public static void main( String[] args ){
        City kirov = new City("Kirov", 300, false, true);
        TransportFactory transportFactory = new TransportFactory();
        Transport transport = transportFactory.getTransport(kirov, 767, 55);
        System.out.println(transport.getName());
        System.out.println(transport.getCapacity());
        System.out.println(transport.getSpeed());
    }
}
