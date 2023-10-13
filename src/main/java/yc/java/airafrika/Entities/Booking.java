package yc.java.airafrika.Entities;

import yc.java.airafrika.Enum.BookingStatus;

import java.time.LocalDate;

public class Booking {
    private String ref;
    private Flight flight;
    private Passenger passenger;
    private BookingStatus status;
    private LocalDate reserved_At;
    private LocalDate canceled_At;
    private Payment payment;

    public String getRef() {
        return ref;
    }

    public Booking setRef(String ref) {
        this.ref = ref;
        return this;

    }

    public Flight getFlight() {
        return flight;
    }

    public Booking setFlight(Flight flight) {
        this.flight = flight;
        return this;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Booking setPassenger(Passenger passenger) {
        this.passenger = passenger;
        return this;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public Booking setStatus(BookingStatus status) {
        this.status = status;
        return this;
    }

    public LocalDate getReserved_At() {
        return reserved_At;
    }

    public Booking setReserved_At(LocalDate reserved_At) {
        this.reserved_At = reserved_At;
        return this;
    }

    public LocalDate getCanceled_At() {
        return canceled_At;
    }

    public Booking setCanceled_At(LocalDate canceled_At) {
        this.canceled_At = canceled_At;
        return this;
    }

    public Payment getPayment() {
        return payment;
    }

    public Booking setPayment(Payment payment) {
        this.payment = payment;
        return this;
    }
}
