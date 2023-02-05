import Drivers.*;
import Exceptions.LicenseExceptions;
import transport.*;
import Drivers.Mechanic;
import static transport.LoadCapacity.*;
import transport.TransportService;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[4];
        cars[0] = new Car("Lada", "Granta", 1.7, BodyType.SEDAN);
        cars[1] = new Car("Audi", "A8 50L TDI quattro", 3.0, BodyType.COUPE);
        cars[2] = new Car("BMW", "Z8", 3.0, BodyType.COUPE);
        cars[3] = new Car("Kia", "Sportage 4th generation", 2.4, BodyType.CROSSOVER);

        Bus[] buses = new Bus[4];
        buses[0] = new Bus("Man", "Lion's Coach", 3, BusCapacity.SMALL);
        buses[1] = new Bus("Mercedes-Benz", "Travego RHD 15 RHD", 3, BusCapacity.BIG);
        buses[2] = new Bus("Scania", "Touring 6X2", 3, BusCapacity.MIDDLE);
        buses[3] = new Bus("King Long", "XMQ6129Y", 3, BusCapacity.EXTRA_BIG);

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("Volvo", "Wild Viking", 12.4, N1);
        trucks[1] = new Truck("Scania", "Red Pearl R999", 15.6, N2);
        trucks[2] = new Truck("Thor", "24", 27.9, N3);
        trucks[3] = new Truck("Freightliner", "Cascadia Banks Super-Turbo", 14, N2);

        TransportService.printTruckWithEnum(trucks);
        trucks[0].printType();
        TransportService.printCarWithEnum(cars);
        cars[0].printType();
        TransportService.printBusWithEnum(buses);
        buses[0].printType();

        System.out.println();
        DriverB driver1 = new DriverB("Aleksey Semenov", "B", 10);
        DriverC driver2 = new DriverC("Andrey Mihailov", "C", 10);
        DriverD driver3 = new DriverD("Sergej Skvortcov", "D", 10);

        checkDriver(driver1, driver2, driver3);
        driver1.driving(cars[2]);
        driver2.driving(buses[1]);
        driver3.driving(trucks[2]);

        List<Transport> CompetitorTransport = new ArrayList<>();
        for (Car car : cars) {
            CompetitorTransport.add(car);
        }
        for (Bus bus : buses) {
            CompetitorTransport.add(bus);
        }
        for (Truck truck : trucks) {
            CompetitorTransport.add(truck);
        }

        Mechanic mechanic1 = new Mechanic<>("Dany", "Service1");
        Mechanic mechanic2 = new Mechanic<>("Anton", "Service2");
        Mechanic mechanic3 = new Mechanic<>("Vlad", "Service3");
        Mechanic mechanic4 = new Mechanic<>("Alex", "Service4");
        Mechanic mechanic5 = new Mechanic<>("Piter", "Service5");
        Mechanic mechanic6 = new Mechanic<>("Nicolis", "Service6");

        mechanic1.addTransportClass(Car.class);
        mechanic1.addTransportClass(Car.class);
        mechanic2.addTransportClass(Car.class);
        mechanic3.addTransportClass(Truck.class);
        mechanic4.addTransportClass(Truck.class);
        mechanic5.addTransportClass(Car.class);
        mechanic5.addTransportClass(Truck.class);
        mechanic6.addTransportClass(Car.class);
        mechanic6.addTransportClass(Truck.class);

        System.out.println();
        cars[0].addDriverToTeam(driver1);
        cars[0].addMechanicToTeam(mechanic1);
        cars[0].addMechanicToTeam(mechanic2);
        cars[0].addMechanicToTeam(mechanic2);
        cars[0].addMechanicToTeam(mechanic3);
        cars[0].addMechanicToTeam(mechanic5);
        cars[0].addMechanicToTeam(mechanic6);
        cars[0].getTeam();
        System.out.println();
        trucks[3].addDriverToTeam(driver2);
        trucks[3].addMechanicToTeam(mechanic3);
        trucks[3].addMechanicToTeam(mechanic4);
        trucks[3].addMechanicToTeam(mechanic4);
        trucks[3].addMechanicToTeam(mechanic5);
        trucks[3].addMechanicToTeam(mechanic6);
        trucks[3].getTeam();

        STO sto = new STO();
        sto.addTransportToQueue(cars[0]);
        sto.addTransportToQueue(trucks[3]);

        Map<Transport, Mechanic[]> transportTeamMap = new HashMap<>();
        transportTeamMap.put(cars[0], cars[0].getMechanics().toArray(new Mechanic[0]));
        transportTeamMap.put(trucks[3], trucks[3].getMechanics().toArray(new Mechanic[0]));
        System.out.println(Arrays.toString(transportTeamMap.get(cars[0])));
        System.out.println(Arrays.toString(transportTeamMap.get(trucks[3])));

        Set<Mechanic> mechanicSet = new HashSet<>();
        Mechanic[] mechanicCar = new Mechanic[cars[0].getMechanics().size()];
        cars[0].getMechanics().toArray(mechanicCar);
        for (int i = 0; i < mechanicCar.length; i++) {
            mechanicSet.add(mechanicCar[i]);
        }
        Mechanic[] mechanicTruck = new Mechanic[trucks[3].getMechanics().size()];
        trucks[3].getMechanics().toArray(mechanicTruck);
        for (int i = 0; i < mechanicTruck.length; i++) {
            mechanicSet.add(mechanicTruck[i]);
        }


        Iterator<Mechanic> mechanicIterator = mechanicSet.iterator();
        while (mechanicIterator.hasNext()) {
            System.out.println(mechanicIterator.next());
        }

    }
    public static void checkDriver (Driver... drivers){
        for (Driver driver : drivers) {
            try {
                Driver.checkLicense(driver);
            } catch (LicenseExceptions e) {
                System.out.println("Driver " + driver.getFullName() + " have a problem with license");
                System.out.println(e.getMessage());
            }
        }
    }
}