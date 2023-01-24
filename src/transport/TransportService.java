package transport;

public class TransportService {
    //Bus with Enum
    public static void printBusWithEnum (Bus[] buses) {
        for (int i = 0; i < buses.length; i++) {
            System.out.println("brand: " + addSpaceBrand(buses[i].getBrand(), buses) +
                    "; model: " + addSpaceModel(buses[i].getModel(), buses) +
                    "; engineVolume: " + buses[i].getEngineVolume()+
                    "; bus capacity: " + addSpaceBusCapacity(buses[i].getBusCapacity().toString(), buses));
        }
    }
    private static int maxLengthBusCapacity (Bus[]buses) {
        int maxLengthColor = buses[0].getBusCapacity().toString().length();
        for (int i = 0; i < buses.length; i++) {
            if (maxLengthColor < buses[i].getBusCapacity().toString().length()) {
                maxLengthColor = buses[i].getBusCapacity().toString().length();
            }
        }
        return maxLengthColor;
    }
    private static String addSpaceBrand(String brand, Transport[] transports) {
        int max = maxLengthBrand(transports);
        String fullBrand = brand;
        if (brand.length() < max) {
            for (int i = 0; i < (max - brand.length()); i++) {
                fullBrand = fullBrand + ".";
            }
        }
        return fullBrand;
    }
    private static String addSpaceModel(String model, Transport[] transports) {
        int max = maxLengthModel(transports);
        String fullModel = model;
        if (model.length() < max) {
            for (int i = 0; i < (max - model.length()); i++) {
                fullModel = fullModel + ".";
            }
        }
        return fullModel;
    }
    private static String addSpaceBusCapacity(String busCapacity, Bus[] buses) {
        int max = maxLengthBusCapacity(buses);
        String fullBusCapacity = busCapacity;
        if (busCapacity.length() < max) {
            for (int i = 0; i < (max - busCapacity.length()); i++) {
                fullBusCapacity = fullBusCapacity + ".";
            }
        }
        return fullBusCapacity;
    }
    private static int maxLengthBrand(Transport[] transports) {
        int maxLengthBrand = transports[0].getBrand().length();
        for (int i = 0; i < transports.length; i++) {
            if (maxLengthBrand < transports[i].getBrand().length()) {
                maxLengthBrand = transports[i].getBrand().length();
            }
        }
        return maxLengthBrand;
    }
    private static int maxLengthModel(Transport[] transports) {
        int maxLengthModel = transports[0].getModel().length();
        for (int i = 0; i < transports.length; i++) {
            if (maxLengthModel < transports[i].getModel().length()) {
                maxLengthModel = transports[i].getModel().length();
            }
        }
        return maxLengthModel;
    }
    //Car with Enum
    public static void printCarWithEnum (Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("brand: " + addSpaceBrand(cars[i].getBrand(), cars) +
                    "; model: " + addSpaceModel(cars[i].getModel(), cars) +
                    "; engineVolume: " + cars[i].getEngineVolume()+
                    "; body type: " + addSpaceBodyType(cars[i].getBodyType().getBodyType(), cars));
        }
    }
    private static String addSpaceBodyType(String bodyType, Car[] cars) {
        int max = maxLengthBodyType(cars);
        String fullBodyType = bodyType;
        if (bodyType.length() < max) {
            for (int i = 0; i < (max - bodyType.length()); i++) {
                fullBodyType = fullBodyType + ".";
            }
        }
        return fullBodyType;
    }
    private static int maxLengthBodyType(Car[] cars) {
        int maxLengthBodyType = cars[0].getBodyType().getBodyType().length();
        for (int i = 0; i < cars.length; i++) {
            if (maxLengthBodyType < cars[i].getBodyType().getBodyType().length()) {
                maxLengthBodyType = cars[i].getBodyType().getBodyType().length();
            }
        }
        return maxLengthBodyType;
    }
    //Truck with Enum
    public static void printTruckWithEnum (Truck[] buses) {
        for (int i = 0; i < buses.length; i++) {
            System.out.println("brand: " + addSpaceBrand(buses[i].getBrand(), buses) +
                    "; model: " + addSpaceModel(buses[i].getModel(), buses) +
                    "; engineVolume: " + buses[i].getEngineVolume()+
                    "; load capacity: " + addSpaceLoadCapacity(buses[i].getLoadCapacity().toString(), buses));
        }
    }
    private static int maxLengthLoadCapacity (Truck[] trucks) {
        int maxLengthColor = trucks[0].getLoadCapacity().toString().length();
        for (int i = 0; i < trucks.length; i++) {
            if (maxLengthColor < trucks[i].getLoadCapacity().toString().length()) {
                maxLengthColor = trucks[i].getLoadCapacity().toString().length();
            }
        }
        return maxLengthColor;
    }
    private static String addSpaceLoadCapacity (String LoadCapacity, Truck[] trucks) {
        int max = maxLengthLoadCapacity(trucks);
        String fullTruckCapacity = LoadCapacity;
        if (LoadCapacity.length() < max) {
            for (int i = 0; i < (max - LoadCapacity.length()); i++) {
                fullTruckCapacity = fullTruckCapacity + ".";
            }
        }
        return fullTruckCapacity;
    }
}