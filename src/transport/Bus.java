package transport;

import java.util.Objects;

public class Bus extends Transport implements Competitor {
    private BusCapacity busCapacity;
    public Bus(String brand, String model, double engineVolume, BusCapacity busCapacity) {
        super(brand, model, engineVolume);
        this.busCapacity = busCapacity;
    }
    @Override
    public void startMoving() {
        System.out.println("The bus is starting to move.");
    }
    @Override
    public void stopMoving() {
        System.out.println("The bus is stopping.");
    }
    public String toString() {
        return "Brand: " + getBrand() + ", " + "Model: " + getModel() + ", " + "Engine Volume: " + getEngineVolume() + " bus capacity: " + busCapacity;
    }
    public BusCapacity getBusCapacity() {
        return busCapacity;
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
    public void printType() {
        System.out.println("bus capacity: " + busCapacity);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return busCapacity == bus.busCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), busCapacity);
    }
}