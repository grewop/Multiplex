package com.touk.Ticketbooking.repositories;

import com.touk.Ticketbooking.model.Screening;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Repository
public interface ScreeningRepository extends PagingAndSortingRepository<Screening, Long> {
    //List<Screening> findByids (@Param("ids") int ids
    @Query(value = "SELECT * FROM SCREENING WHERE ids = :moviesList", nativeQuery = true)
    List<Screening> findByMoviesList(@Param("moviesList") int moviesList);

    @Query(value = "SELECT * FROM SCREENING WHERE SCREENING_DATE = :screeningDate AND SCREENING_TIME = :hour", nativeQuery = true)
    List<Screening> findByscreeningTimes(@Param("screeningDate") LocalDate screeningTimes, @Param("hour") LocalTime screeningHour);

}