package yc.java.airafrika.Entities;

import java.util.List;

public class AirPlane {

    private String id;
    private String name;
    private int capacity;
    private List<Flight> flightList;

    public String getId() {
        return id;
    }

    public AirPlane setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AirPlane setName(String name) {
        this.name = name;
        return this;
    }

    public int getCapacity() {
        return capacity;
    }

    public AirPlane setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public AirPlane setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
        return this;
    }
}
