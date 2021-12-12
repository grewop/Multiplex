package com.touk.Ticketbooking.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;


    @Entity(name = "rooms")
    @Getter
    @Setter
    public class Room {

        @Id
        @GeneratedValue(strategy = IDENTITY)
        private long id;
        @NotNull
        private String roomName;
        @NotNull
        private int numberOfSeats;
        @OneToMany( targetEntity = Screening.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        @JoinColumn(name="SCREENING_ID")
        private List<Screening> screenings ;

        @OneToMany( targetEntity = Seats.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        @JoinColumn(name="SEAT_ID")
        private List<Seats> seats ;



    }