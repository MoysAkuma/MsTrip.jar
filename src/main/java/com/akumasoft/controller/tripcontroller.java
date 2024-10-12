package com.akumasoft.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akumasoft.entity.Trip;
import com.akumasoft.response.TripResponse;
import com.akumasoft.response.TripSearchResponse;
import com.akumasoft.service.TripService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/trip/")
public class tripcontroller {

	@Autowired
	TripService srvTrip;
	
	@GetMapping("/new")
	public List<TripResponse> getNewPublicTrips(){
		List<Trip> tripList = srvTrip.getNewPublicTrips();
		List<TripResponse> tripRL = new ArrayList<TripResponse>();
		
		tripList.stream().forEach(v -> {
			tripRL.add(new TripResponse(v));
		});
		
		return tripRL;
	}
	
	@GetMapping("like/{TripName}")
	public List<TripSearchResponse> getLikeTripName(@RequestParam String TripName) {
		List<Trip> tripList = srvTrip.findByName(TripName);
		List<TripSearchResponse> tripRL = new ArrayList<TripSearchResponse>();
		tripList.stream().forEach(v -> {
			tripRL.add(new TripSearchResponse(v));
		});
		
		return tripRL;
	}
	
}
