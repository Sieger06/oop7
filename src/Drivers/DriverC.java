package Drivers;

import transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String fullName, String driversLicence, int drivingExperience) {
        super(fullName, "C", drivingExperience);
    }
}