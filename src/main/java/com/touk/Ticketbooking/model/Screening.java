package com.touk.Ticketbooking.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

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

    @ManyToOne
    @JoinColumn(name="movie_id")
    @JsonIgnoreProperties(value = {"SCREENING"})
    private Movie movie;

    @ManyToOne
    @JoinColumn(name="rooms_id")
    @JsonIgnoreProperties(value = {"SCREENING"})
    private Room rooms;


    }
