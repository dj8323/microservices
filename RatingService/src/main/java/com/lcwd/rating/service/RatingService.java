package com.lcwd.rating.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lcwd.rating.entities.Rating;

@Service
public interface RatingService {

	Rating creatRating(Rating rating);
	List<Rating> getRatings();
	List<Rating> getRatingByUserId(String userId);
	List<Rating> getRatingByHotelId(String hotelId);
	
	
	
}
