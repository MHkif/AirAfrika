package yc.java.airafrika.Entities;

import yc.java.airafrika.Enum.BaggageType;

public class Baggage {
    private String id;
    private BaggageType type;
    private double weight;

    private Flight  flight;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BaggageType getType() {
        return type;
    }

    public void setType(BaggageType type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
