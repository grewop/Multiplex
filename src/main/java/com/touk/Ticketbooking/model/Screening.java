package com.touk.Ticketbooking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "SCREENING")
@Getter
@Setter
public class Screening {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ids;

    @Column(name = "SCREENING_TIMES")
     private LocalDate screening_times;

    @Column(name = "SCREENING_HOUR")
    private LocalTime screeningHour;
    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="MOVIES_ID")
    private List<Movie> movies;

    @ManyToOne
    private Room rooms;


    }
