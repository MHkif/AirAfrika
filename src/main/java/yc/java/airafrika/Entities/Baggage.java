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

    public Baggage setId(String id) {
        this.id = id;
        return this;
    }

    public BaggageType getType() {
        return type;
    }

    public Baggage setType(BaggageType type) {
        this.type = type;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public Baggage setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public Flight getFlight() {
        return flight;
    }

    public Baggage setFlight(Flight flight) {
        this.flight = flight;
        return this;
    }
}
