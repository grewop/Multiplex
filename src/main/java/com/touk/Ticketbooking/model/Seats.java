package com.touk.Ticketbooking.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
@Entity
@Table(name = "SEATS")
@Getter
@Setter
public class Seats {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    @NotNull
    private int seatNumber;
    @ManyToOne
    @JoinColumn(name="room_id")
    private Room room;


}