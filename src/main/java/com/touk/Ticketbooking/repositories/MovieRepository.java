package com.touk.Ticketbooking.repositories;

import com.touk.Ticketbooking.model.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends PagingAndSortingRepository<Movie, Long> {

    List<Movie> findByTitle (@Param("title") String title);
    @Query(value = "SELECT * FROM MOVIES WHERE SCREENING_TIMES = :screeningTimes", nativeQuery = true)
    List<Movie> findByscreeningTimes (@Param("screeningTimes") String screeningTimes);
}

