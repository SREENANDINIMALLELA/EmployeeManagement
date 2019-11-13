import Vehicle.Vehicle;

import java.util.ArrayList;

public class DealerShip {
    private ArrayList<Vehicle> vehicleInStock;
    private double till ;
    public DealerShip(ArrayList<Vehicle> vehicleInStock , double till){
      this.till=till;
      this.vehicleInStock=vehicleInStock;
    }
    public void buyVehicle(Vehicle vehicle ,Customer customer ){
        vehicleInStock.remove(vehicle);
        customer.buyVehicle(vehicle);
    }
}

