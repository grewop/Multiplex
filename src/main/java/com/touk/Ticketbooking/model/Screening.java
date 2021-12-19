package com.touk.Ticketbooking.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "SCREENING")
@Getter
@Setter
public class Screening {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ids;

    @Column(name = "SCREENING_DATE")
    private LocalDate screening_date;

    @Column(name = "SCREENING_TIME")
    private int screening_time;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    @JsonIgnoreProperties(value = {"SCREENING"})
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "rooms_id")
    @JsonIgnoreProperties(value = {"SCREENING"})
    private Room rooms;

    public Screening() {
    }

    public Screening(LocalDate screening_date, int screening_time, Movie movie) {
        this.screening_date = screening_date;
        this.screening_time = screening_time;
        this.movie = movie;
    }
}
