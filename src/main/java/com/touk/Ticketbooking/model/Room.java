package com.touk.Ticketbooking.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
        @OneToMany(mappedBy = "rooms")
        @JsonIgnoreProperties(value = {"rooms"})
        private List<Screening> screenings ;

        @OneToMany(mappedBy = "rooms")
        @JsonIgnoreProperties(value = {"rooms"})
        private List<Seats> seats ;



    }