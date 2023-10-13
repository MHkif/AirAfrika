package yc.java.airafrika.Entities;

import yc.java.airafrika.Entities.Abstracts.User;

import java.util.List;

public class Passenger extends User {

    private List<Flight> flightList;

    public List<Flight> getFlightList() {
        return flightList;
    }

    public Passenger setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
        return this;
    }

    @Override
    public String toString() {
        return "Passenger { " +
                "id =" + this.id +
                ", firstName = '" + this.firstName + '\'' +
                ", lastName = '" + this.lastName + '\'' +
                ", email = '" + this.email + '\'' +
                ", password = '" + this.password + '\'' +
                ", phoneNumber = '" + this.phoneNumber + '\'' +
                '}';
    }
}
