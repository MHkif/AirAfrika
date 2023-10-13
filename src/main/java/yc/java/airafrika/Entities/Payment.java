package yc.java.airafrika.Entities;

import yc.java.airafrika.Enum.PaymentMode;

import java.time.LocalDate;

public class Payment {
    private String id;
    private double amount;
    private LocalDate paid_At;
    private PaymentMode mode;
    private  Booking booking;

    public String getId() {
        return id;
    }

    public Payment setId(String id) {
        this.id = id;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Payment setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public LocalDate getPaid_At() {
        return paid_At;
    }

    public Payment setPaid_At(LocalDate paid_At) {
        this.paid_At = paid_At;
        return this;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public Payment setMode(PaymentMode mode) {
        this.mode = mode;
        return this;
    }

    public Booking getBooking() {
        return booking;
    }

    public Payment setBooking(Booking booking) {
        this.booking = booking;
        return this;
    }
}
