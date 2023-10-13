package yc.java.airafrika.Entities;

import java.util.List;

public class AirPort {
    private int id;
    private String name;
    private String city;
    private String country;
    private List<Flight> flightList;

    public int getId() {
        return id;
    }

    public AirPort setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AirPort setName(String name) {
        this.name = name;
        return this;
    }

    public String getCity() {
        return city;
    }

    public AirPort setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public AirPort setCountry(String country) {
        this.country = country;
        return this;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public AirPort setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
        return this;
    }
}
