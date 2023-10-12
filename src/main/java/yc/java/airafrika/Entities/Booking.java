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

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public LocalDate getReserved_At() {
        return reserved_At;
    }

    public void setReserved_At(LocalDate reserved_At) {
        this.reserved_At = reserved_At;
    }

    public LocalDate getCanceled_At() {
        return canceled_At;
    }

    public void setCanceled_At(LocalDate canceled_At) {
        this.canceled_At = canceled_At;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
