package org.example;

public class Logistics {
    private Transport[] vehicles;

    public Logistics(Transport ... vehicles) {
        this.vehicles = vehicles;
    }

    public Transport[] getVehicles() {
        return vehicles;
    }

    public Transport getShipping(City city, int weight, int hours){
        Transport suitableVehicle = null;

        for(Transport vehicle : getVehicles()){
            if(!vehicle.isShippingAvailable(city, weight, hours)) continue;
            if(suitableVehicle == null || suitableVehicle.getPrice(city) > vehicle.getPrice(city)){
                suitableVehicle = vehicle;
            }
        }
        return suitableVehicle;
    }
}
