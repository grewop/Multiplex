package com.touk.Ticketbooking.services;

import com.touk.Ticketbooking.dto.ScreeningDto;
import com.touk.Ticketbooking.model.Movie;
import com.touk.Ticketbooking.model.Screening;
import com.touk.Ticketbooking.repositories.MovieRepository;
import com.touk.Ticketbooking.repositories.RoomRepository;
import com.touk.Ticketbooking.repositories.ScreeningRepository;
import com.touk.Ticketbooking.repositories.SeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(rollbackOn = Exception.class)
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
    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movieRepository.findAll().forEach(movies::add);
        return movies;
    }

    public List<Screening> getMoviesScreeningTime(LocalDate screeningTimes, LocalTime hour) {
        return screeningRepository.findByscreeningTimes(screeningTimes, hour);
    }

    public List<Screening> getScreeningMovies(int movieID) {
        return screeningRepository.findByMoviesList(movieID);
    }

    public void addMovie(Movie movie) {
        this.movieRepository.save(movie);
    }
    public void addScreening(ScreeningDto screeningDto) {
        Movie movie = movieRepository.findById(screeningDto.getMovieId()).orElseThrow();
       // Room room = roomRepository.findById(screeningDto.getRoomId());

        Screening screening = new Screening(screeningDto.getScreening_date(),screeningDto.getScreening_time(),movie);
        System.out.println(screening.getScreening_time());
        System.out.println(screeningDto.getScreening_time());
        this.screeningRepository.save(screening);
    }

}
