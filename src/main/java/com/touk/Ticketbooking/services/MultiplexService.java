package com.touk.Ticketbooking.services;

import com.touk.Ticketbooking.model.Movie;
import com.touk.Ticketbooking.model.Screening;
import com.touk.Ticketbooking.repositories.MovieRepository;
import com.touk.Ticketbooking.repositories.RoomRepository;
import com.touk.Ticketbooking.repositories.ScreeningRepository;
import com.touk.Ticketbooking.repositories.SeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class MultiplexService {
    @Autowired
    MovieRepository movieRepository;
    @Autowired
    ScreeningRepository screeningRepository;
    @Autowired
    SeatsRepository seatsRepository;
    @Autowired
    RoomRepository roomRepository;

    //zaopytania do bazy danych, tworzenie obiektow, itp.
    public List<Movie> getMovies(){
        List<Movie> movies = new ArrayList<>();
        movieRepository.findAll().forEach(movies::add);
        return movies;
    }
    public List<Screening> getMoviesScreeningTime(LocalDate screeningTimes, LocalTime hour){
        List<Screening> movies = new ArrayList<>();
        screeningRepository.findByscreeningTimes(screeningTimes, hour).forEach(movies::add);
        return movies;
    }
    public List<Screening> getScreeningMovies(int movieID){
        List<Screening> movie = new ArrayList<>();
        screeningRepository.findByMoviesList(movieID).forEach(movie::add);
        return movie;
    }
}
