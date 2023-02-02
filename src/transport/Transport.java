package transport;

import Drivers.Driver;
import Drivers.Mechanic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    protected ArrayList<Driver> drivers;
    protected ArrayList<Mechanic> mechanics;
    protected Driver driver;
    Transport(String brand, String model) {
        this.brand = checkString(brand);
        this.model =  checkString(model);
        this.engineVolume = checkDouble(engineVolume);
    }
    Transport(String brand, String model, double engineVolume) {
        this.brand = checkString(brand);
        this.model =  checkString(model);
        this.engineVolume = checkDouble(engineVolume);
    }
    protected static String checkString (String string) {
        if (string == null || string.isBlank() || string.isEmpty()) {
            string = "default";
        }
        return string;
    }
    protected static double checkDouble (double i) {
        if (i <= 0 ) {
            i = 1.2;
        }
        return i;
    }
    public String getBrand() {
        return brand;}
    public String getModel() {
        return model;}
    public double getEngineVolume() {
        return engineVolume;
    }
    public double setEngineVolume(){
        return engineVolume;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;}
    public void getTeam() {
        System.out.println(getBrand() + getModel() + "Team");
        System.out.println("Driver - " + driver.getFullName());
        for (int i = 0; i < mechanics.size(); i++) {
            System.out.println("Mechanic " + (i+1) + " - " + mechanics.get(i));
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }
    @Override
    public String toString() {
        return "brand: " + brand + " model: " + model + "engine volume: " + engineVolume;
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void pitStop();
    public abstract void getBestLapTime();
    public abstract void getMaximumSpeed();
    public abstract void printType();
}