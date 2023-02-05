package Drivers;

import transport.Bus;
import transport.Transport;

public class DriverD extends Driver<Bus> {
    public DriverD(String fullName, String driversLicence, int drivingExperience) {
        super(fullName, "D", drivingExperience);
    }

    public void driving(Transport Bus) {
        super.driving(Bus);
    }
}