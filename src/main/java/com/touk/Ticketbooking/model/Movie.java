package com.touk.Ticketbooking.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MOVIES")
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title")
    private String title;
    @OneToMany(mappedBy = "movie")
    @JsonIgnoreProperties(value = {"movie"})
    private List<Screening> screening;

    public Movie() {
    }

    public Movie(String title) {
        this.title = title;
    }

    public Movie(long id, String title, String movieScreeningTime, List<Screening> screening) {
        this.id = id;
        this.title = title;
        this.screening = screening;
    }
}
