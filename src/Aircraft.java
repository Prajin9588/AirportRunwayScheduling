public class Aircraft {
    private final String id;
    private final String type;
    private final int fuelLevel;
    private final int arrivalTime;
    private final int serviceTime;

    public Aircraft(String id, String type, int fuelLevel,
                    int arrivalTime, int serviceTime) {
        this.id = id;
        this.type = type;
        this.fuelLevel = fuelLevel;
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    @Override
    public String toString() {
        return id + " | " + type +
                " | Fuel: " + fuelLevel +
                " | Arrival: " + arrivalTime;
    }
}