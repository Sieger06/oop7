package Drivers;

import Exceptions.LicenseExceptions;
import transport.Car;
import transport.Transport;

import java.util.Objects;

public abstract class Driver <T extends Transport> {
    private String fullName;
    private String driversLicence;
    private int drivingExperience;
    public Driver(String fullName, String driversLicence, int drivingExperience) {
        this.fullName = checkString(fullName);
        this.driversLicence = driversLicence;
        this.drivingExperience = checkInt(drivingExperience);
    }
    public String isDriversLicence() {
        return driversLicence;
    }
    public String getFullName() {
        return fullName;
    }
    public String getLicense() {
        return driversLicence;
    }
    public int getExperience() {
        return drivingExperience;
    }
    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Ivanov Ivan Ivanovich";
        } else {
            this.fullName = fullName;
        }
    }

    public void setDriversLicence(String driversLicence) {
        this.driversLicence = driversLicence;
    }
    public int getDrivingExperience() {
        return drivingExperience;
    }
    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience <= 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }
    public int hashCode() {
        return Objects.hash(fullName, driversLicence, drivingExperience);
    }
    public void startMoving() {
        System.out.printf("The driver %s started is moving.", this.fullName);
    }
    public void stopMoving() {
        System.out.printf("The driver %s has finished moving.", this.fullName);
    }
    public static void checkLicense(Driver driver) throws LicenseExceptions {
        String s = driver.getLicense();
        if (driver.getLicense() == null || s.isEmpty() || s.isBlank()) {
            throw new LicenseExceptions("Necessary specify license type", driver.getFullName());
        } else {
            System.out.println("Driver " + driver.getFullName() + " dosen`t have a problem with license");
        }
    }
    private static String checkString (String string){
        if (string == null || string.isEmpty() || string.isBlank()) {
            throw new IllegalArgumentException("Не верно указана информация");
        }
        return string;
    }
    private static int checkInt (int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Не верно указана информация");
        }
        return i;
    }
    public void driving(Transport transport){
        System.out.println("Driver " + getFullName() +
                " is driving " + transport.getBrand() + " " +transport.getModel() +
                " and will participate in the race.");
    }
}