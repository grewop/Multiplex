package com.touk.Ticketbooking.controllers;

import com.touk.Ticketbooking.dto.ScreeningDto;
import com.touk.Ticketbooking.model.Movie;
import com.touk.Ticketbooking.model.Screening;
import com.touk.Ticketbooking.services.MultiplexService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/Multiplex")
@RequiredArgsConstructor
public class MultiplexController {
    private final MultiplexService multiplexService;

    //movie lista filmow
    @GetMapping(
            value = "/getMovies",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getMovies() {
        List<Movie> list = multiplexService.getMovies();
        return ResponseEntity.ok(list);
    }

    //pokaz filmy w takim dniu i godzinie
    @GetMapping(
            value = "/getScreening/{dateTime},{hour}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getMovieTime(@PathVariable("dateTime") LocalDate dateTime, @PathVariable("hour") LocalTime hour) {
        List<Screening> list = multiplexService.getMoviesScreeningTime(dateTime, hour);
        return ResponseEntity.ok(list);
    }

    //screeningroom zwraca info o pokoju
    @GetMapping(
            value = "/screeningroom/{ids}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity getScreeningRoom(@PathVariable("ids") int ids) {
        List<Screening> list = multiplexService.getScreeningMovies(ids);

        return ResponseEntity.ok(list);
    }

    //post screening rezerwacja
    @PostMapping(
            value = "/screening/",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void getReservation(@RequestBody ScreeningDto screening) {

        multiplexService.addScreening(screening);
    }

    //dodaj film
    @PostMapping(
            value = "/movie",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void postMovie(@RequestBody Movie movie) {
        multiplexService.addMovie(movie);
    }

    //dodaj rezerwacje
    @PostMapping(
            value = "/reservation/{seat}{name}{surname}{type}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void postScreening() {

    }

    //dodaj room
    @PostMapping(
            value = "/reservation/{room}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void postroom() {

    }
}
