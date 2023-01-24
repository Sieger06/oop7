package Drivers;

import transport.Bus;

public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, String driversLicence, int drivingExperience) {
        super(fullName, "D", drivingExperience);
    }
}