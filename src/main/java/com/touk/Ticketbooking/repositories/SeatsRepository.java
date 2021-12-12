package com.touk.Ticketbooking.repositories;

import com.touk.Ticketbooking.model.Seats;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatsRepository extends PagingAndSortingRepository<Seats, Long> {

}
