package com.touk.Ticketbooking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "MOVIES")
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idm;
    @Column(name = "title")
    private String title;
    @Column(name = "movie_screening_time")
    private String movieScreeningTime;
    @ManyToOne
    private Screening screening;

    public Movie(String title, String movieScreeningTime, Screening screening) {
        this.title = title;
        this.movieScreeningTime = movieScreeningTime;
        this.screening = screening;
    }
}
