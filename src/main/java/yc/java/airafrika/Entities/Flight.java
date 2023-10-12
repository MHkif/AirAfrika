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

    public void setId(String id) {
        this.id = id;
    }

    public AirPort getDeparture() {
        return departure;
    }

    public void setDeparture(AirPort departure) {
        this.departure = departure;
    }

    public AirPort getArrival() {
        return arrival;
    }

    public void setArrival(AirPort arrival) {
        this.arrival = arrival;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public FilghtType getType() {
        return type;
    }

    public void setType(FilghtType type) {
        this.type = type;
    }

    public LocalDate getDepart_At() {
        return depart_At;
    }

    public void setDepart_At(LocalDate depart_At) {
        this.depart_At = depart_At;
    }

    public LocalDate getArrived_At() {
        return arrived_At;
    }

    public void setArrived_At(LocalDate arrived_At) {
        this.arrived_At = arrived_At;
    }

    public AirPlane getAirPlane() {
        return airPlane;
    }

    public void setAirPlane(AirPlane airPlane) {
        this.airPlane = airPlane;
    }



    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public List<Baggage> getBaggageList() {
        return baggageList;
    }

    public void setBaggageList(List<Baggage> baggageList) {
        this.baggageList = baggageList;
    }

    public List<Extra> getExtraList() {
        return extraList;
    }

    public void setExtraList(List<Extra> extraList) {
        this.extraList = extraList;
    }

    public List<Escale> getEscaleList() {
        return escaleList;
    }

    public void setEscaleList(List<Escale> escaleList) {
        this.escaleList = escaleList;
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
