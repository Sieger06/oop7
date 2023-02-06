package transport;

import Drivers.Driver;
import Drivers.Mechanic;

import java.util.Objects;

public class Truck extends Transport implements Competitor {
    private LoadCapacity loadCapacity;
    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super("", "", 0);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("The truck is starting to move.");
    }
    @Override
    public void stopMoving() {
        System.out.println("The truck is stopping.");
    }
    @Override
    public void pitStop() {
        System.out.println("Your car should drive to a pit-stop");
    }
    @Override
    public void getBestLapTime() {
        System.out.println("Best car lap time is: ");
    }
    @Override
    public void getMaximumSpeed() {
        System.out.println("Maximum car speed is: ");
    }
    @Override
    public void printType() {
        System.out.println("Body type " + loadCapacity);
    }
    public String toString() {
        return "Brand: " + getBrand() + ", " + "Model: " + getModel() + ", " + "Engine Volume: " + getEngineVolume();
    }
    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }
    public void addDriverToTeam(Driver<Truck> driver) {
        this.driver = driver;
    }
    public void addMechanicToTeam(Mechanic mechanic) {
        if (mechanic.getClassList().contains(Truck.class))
            if (!mechanics.contains(mechanic)) {
                mechanics.add(mechanic);
            } else {
                System.out.println("Mechanic " + mechanic.getFullName() + " doesn`t work with " + this.getClass().getSimpleName());
            }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }
}