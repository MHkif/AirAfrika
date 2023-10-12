package yc.java.airafrika.Entities;

import yc.java.airafrika.Enum.PaymentMode;

import java.time.LocalDate;

public class Payment {
    private String id;
    private double amount;
    private LocalDate paid_At;
    private PaymentMode mode;
    // #TODO : Add Booking here
}
