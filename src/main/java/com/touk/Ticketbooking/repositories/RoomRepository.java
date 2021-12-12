package com.touk.Ticketbooking.repositories;

import com.touk.Ticketbooking.model.Room;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends PagingAndSortingRepository<Room, Long>{
}

