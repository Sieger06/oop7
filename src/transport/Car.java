package transport;

import Drivers.Driver;
import Drivers.Mechanic;

import java.util.Objects;

public class Car extends Transport implements Competitor {
    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }
    public static String checkString(String string){
        if (string == null || string.isEmpty() || string.isBlank()) {
            throw new IllegalArgumentException("Not found");
        }
        return string;
    }
    private static int checkDouble (int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Not found");
        }
        return i;
    }
    public BodyType getBodyType() {
        return bodyType;
    }
    public void startMoving() {
        System.out.println("The car is starting move.");
    }
    public void stopMoving() {
        System.out.println("The car stopping.");
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
        System.out.println("Body type: " + getBodyType());
    }
    public String toString() {
        return "Brand: " + getBrand() + ", " + "Model: " + getModel() + ", " + "Engine Volume: " + getEngineVolume();
    }
    public void addDriverToTeam(Driver<Car> driver) {
        this.driver = driver;
    }
    public void addMechanicToTeam(Mechanic mechanic) {
        if (mechanic.getClassList().contains(Car.class)){
            if (mechanics.contains(mechanic)) {
                mechanics.add(mechanic);
            }
        } else {
            System.out.println("Mechanic " + mechanic.getFullName() + " doesn`t work with " + this.getClass().getSimpleName());
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return bodyType == car.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType);
    }
}