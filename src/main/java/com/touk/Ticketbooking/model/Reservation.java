package com.touk.Ticketbooking.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;
@Entity
@Table(name = "RESERVATION")
@Setter
@Getter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idr;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "type")
    private String type;
    @NonNull
    private float price;
    @NonNull
    private int ids;



}
