package yc.java.airafrika.Entities;

import java.time.LocalDate;

public class Escale {
    private int id;
    private Flight flight;
    private AirPort airPort;
    private LocalDate depart_At;
    private LocalDate arrived_At;

    public int getId() {
        return id;
    }

    public Escale setId(int id) {
        this.id = id;
        return this;
    }

    public Flight getFlight() {
        return flight;
    }

    public Escale setFlight(Flight flight) {
        this.flight = flight;
        return this;
    }

    public AirPort getAirPort() {
        return airPort;
    }

    public Escale setAirPort(AirPort airPort) {
        this.airPort = airPort;
        return this;
    }

    public LocalDate getDepart_At() {
        return depart_At;
    }

    public Escale setDepart_At(LocalDate depart_At) {
        this.depart_At = depart_At;
        return this;
    }

    public LocalDate getArrived_At() {
        return arrived_At;
    }

    public Escale setArrived_At(LocalDate arrived_At) {
        this.arrived_At = arrived_At;
        return this;
    }
}
