package com.touk.Ticketbooking.repositories;

import com.touk.Ticketbooking.model.Reservation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository  extends PagingAndSortingRepository<Reservation, Long>

    {

        List<Reservation> findByidr (@Param("idr") int idr);

    }