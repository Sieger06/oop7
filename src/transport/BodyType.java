package transport;

public enum BodyType {
    SEDAN("Sedan"),
    HATCHBACK( "Hatchback"),
    COUPE("Coupe"),
    STATION_WAGON("Station Wagon"),
    SUV("SUV"),
    CROSSOVER("Crossover"),
    PICKUP_TRUCK("Pickup Truck"),
    VAN("Van"),
    MINIVAN("Minivan"),
    ROADSTER("Roadster") ;
    private final String bodyType;
    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }
    public String getBodyType(){
        return bodyType;
    }
    public String toString(){
        return bodyType;
    }
}