package com.touk.Ticketbooking.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
@Entity(name = "tickets")
@Getter
@Setter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    @Column(name = "ticket_type")
    private String ticketType;
    private BigDecimal price;

    @NotNull
    @Column(name = "seat_number")
    private int seatNumber;

    @Column(name = "session_date")
    private LocalDate sessionDate;

    @Column(name = "session_time")
    private LocalTime sessionTime;

    @ManyToOne
    private Screening screening;


    @ManyToOne
    private Client client;



}