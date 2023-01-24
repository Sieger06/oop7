package transport;
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
}