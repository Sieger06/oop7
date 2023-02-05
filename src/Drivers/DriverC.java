package Drivers;

import transport.Transport;
import transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String fullName, String driversLicence, int drivingExperience) {
        super(fullName, "C", drivingExperience);
    }
    public void driving(Transport Truck) {
        super.driving(Truck);
    }
}