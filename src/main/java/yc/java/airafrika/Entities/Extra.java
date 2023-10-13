package yc.java.airafrika.Entities;

import yc.java.airafrika.Enum.ExtraType;

public class Extra {
    private int id;
    private Flight flight;

    private ExtraType type;
    private double amount;

    public int getId() {
        return id;
    }

    public Extra setId(int id) {
        this.id = id;
        return this;
    }

    public Flight getFlight() {
        return flight;
    }

    public Extra setFlight(Flight flight) {
        this.flight = flight;
        return this;
    }

    public ExtraType getType() {
        return type;
    }

    public Extra setType(ExtraType type) {
        this.type = type;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Extra setAmount(double amount) {
        this.amount = amount;
        return this;
    }
}
