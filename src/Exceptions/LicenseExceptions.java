package Exceptions;
import Drivers.Driver;
public class LicenseExceptions extends Exception {
    private Driver driver;
    public LicenseExceptions(String message, String driverName) {
        super(message);
        this.driver = driver;
    }
    public String getNameDriver() {
        return driver.getFullName();
    }
}