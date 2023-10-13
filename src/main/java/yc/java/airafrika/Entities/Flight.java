package yc.java.airafrika.Entities;

import yc.java.airafrika.Enum.FilghtType;

import java.time.LocalDate;
import java.util.List;

public class Flight {
    private String id;
    private AirPort departure;
    private AirPort arrival;
    private LocalDate depart_At;
    private LocalDate arrived_At;
    private double amount;
    private FilghtType type;
    private AirPlane airPlane;
    private List<Baggage> baggageList;
    private List<Passenger> passengerList;
    private List<Extra> extraList;
    private List<Escale> escaleList;



    public String getId() {
        return id;
    }

    public Flight setId(String id) {
        this.id = id;
        return this;
    }

    public AirPort getDeparture() {
        return departure;
    }

    public Flight setDeparture(AirPort departure) {
        this.departure = departure;
        return this;
    }

    public AirPort getArrival() {
        return arrival;
    }

    public Flight setArrival(AirPort arrival) {
        this.arrival = arrival;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Flight setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public FilghtType getType() {
        return type;
    }

    public Flight setType(FilghtType type) {
        this.type = type;
        return this;
    }

    public LocalDate getDepart_At() {
        return depart_At;
    }

    public Flight setDepart_At(LocalDate depart_At) {
        this.depart_At = depart_At;
        return this;
    }

    public LocalDate getArrived_At() {
        return arrived_At;
    }

    public Flight setArrived_At(LocalDate arrived_At) {
        this.arrived_At = arrived_At;
        return this;
    }

    public AirPlane getAirPlane() {
        return airPlane;
    }

    public Flight setAirPlane(AirPlane airPlane) {
        this.airPlane = airPlane;
        return this;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public Flight setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
        return this;
    }

    public List<Baggage> getBaggageList() {
        return baggageList;
    }

    public Flight setBaggageList(List<Baggage> baggageList) {
        this.baggageList = baggageList;
        return this;
    }

    public List<Extra> getExtraList() {
        return extraList;
    }

    public Flight setExtraList(List<Extra> extraList) {
        this.extraList = extraList;
        return this;
    }

    public List<Escale> getEscaleList() {
        return escaleList;
    }

    public Flight setEscaleList(List<Escale> escaleList) {
        this.escaleList = escaleList;
        return this;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id='" + id + '\'' +
                ", departure=" + departure +
                ", arrival=" + arrival +
                ", depart_At=" + depart_At +
                ", arrived_At=" + arrived_At +
                ", amount=" + amount +
                ", type=" + type +
                ", airPlane=" + airPlane +
                ", baggageList=" + baggageList +
                ", passengerList=" + passengerList +
                ", extraList=" + extraList +
                ", escaleList=" + escaleList +
                '}';
    }
}
