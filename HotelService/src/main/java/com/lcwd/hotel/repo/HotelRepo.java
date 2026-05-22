package com.lcwd.hotel.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.hotel.entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String>{
	
	Optional<Hotel> findByName(String name);	

}
