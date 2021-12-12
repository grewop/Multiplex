package com.touk.Ticketbooking.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "CLIENT")
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    @NonNull
    private String name;
    @NonNull
    private String surname;
    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="CLIENT_ID")
    private Set<Ticket> tickets;



}
