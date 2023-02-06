package Drivers;

import transport.Car;
import transport.Transport;

public class DriverB extends Driver<Car> {
    public DriverB(String fullName, String driversLicence, int drivingExperience) {
        super(fullName, "B", drivingExperience);
    }
    public void driving(Transport Car) {
        super.driving(Car);
    }
}