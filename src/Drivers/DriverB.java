package Drivers;

import transport.Car;

public class DriverB extends Driver<Car> {
    public DriverB(String fullName, String driversLicence, int drivingExperience) {
        super(fullName, "B", drivingExperience);
    }
}