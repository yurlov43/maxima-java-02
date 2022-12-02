package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransportFactoryTest {
    private TransportFactory transportFactory;
    private City city;

    @Before
    public void prepare() {
        transportFactory = new TransportFactory();
        city = new City("Kirov", 300, true, true);
    }

    @Test
    public void shouldReturnShip() {
        city = new City("Kirov", 200, false, true);
        assertEquals("Ship", transportFactory.getTransport(city, 50, 6).getName());

        city = new City("Kirov", 200, true, true);
        assertEquals("Ship", transportFactory.getTransport(city, 50, 6).getName());


        city = new City("Kirov", 200, false, true);
        assertEquals("Ship", transportFactory.getTransport(city, 50, 5).getName());

        city = new City("Kirov", 200, true, true);
        assertEquals("Ship", transportFactory.getTransport(city, 50, 5).getName());
    }

    @Test
    public void shouldReturnPlane() {
        city = new City("Kirov", 250, true, false);
        assertEquals("Plane", transportFactory.getTransport(city, 50, 2).getName());

        city = new City("Kirov", 250, true, true);
        assertEquals("Plane", transportFactory.getTransport(city, 50, 2).getName());


        city = new City("Kirov", 240, true, false);
        assertEquals("Plane", transportFactory.getTransport(city, 50, 2).getName());

        city = new City("Kirov", 240, true, true);
        assertEquals("Plane", transportFactory.getTransport(city, 50, 2).getName());

    }

    @Test
    public void shouldReturnTruck() {
        city = new City("Kirov", 200, false, false);
        assertEquals("Truck", transportFactory.getTransport(city, 50, 6).getName());

        city = new City("Kirov", 300, false, false);
        assertEquals("Truck", transportFactory.getTransport(city, 50, 5).getName());

        city = new City("Kirov", 400, false, false);
        assertEquals("Truck", transportFactory.getTransport(city, 50, 2).getName());


        city = new City("Kirov", 200, true, false);
        assertEquals("Truck", transportFactory.getTransport(city, 50, 6).getName());

        city = new City("Kirov", 300, true, false);
        assertEquals("Truck", transportFactory.getTransport(city, 50, 5).getName());


        city = new City("Kirov", 300, false, true);
        assertEquals("Truck", transportFactory.getTransport(city, 50, 5).getName());

        city = new City("Kirov", 400, false, true);
        assertEquals("Truck", transportFactory.getTransport(city, 50, 2).getName());


        city = new City("Kirov", 300, true, true);
        assertEquals("Truck", transportFactory.getTransport(city, 50, 5).getName());
    }

    @Test
    public void shouldRoundCapacity() {
        assertEquals(500, transportFactory.getTransport(city, 50, 3).getCapacity());
        assertEquals(500, transportFactory.getTransport(city, 500, 3).getCapacity());

        assertEquals(1000, transportFactory.getTransport(city, 650, 3).getCapacity());
        assertEquals(1000, transportFactory.getTransport(city, 1000, 3).getCapacity());

        assertEquals(1500, transportFactory.getTransport(city, 1100, 3).getCapacity());
        assertEquals(1500, transportFactory.getTransport(city, 1500, 3).getCapacity());
    }

    @Test
    public void shouldRoundSpeed() {
        assertEquals(10, transportFactory.getTransport(city, 50, 40).getSpeed());
        assertEquals(10, transportFactory.getTransport(city, 50, 30).getSpeed());

        assertEquals(20, transportFactory.getTransport(city, 50, 20).getSpeed());
        assertEquals(20, transportFactory.getTransport(city, 50, 15).getSpeed());
    }
}
