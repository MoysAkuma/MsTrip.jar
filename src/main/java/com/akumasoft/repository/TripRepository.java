package com.akumasoft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akumasoft.entity.*;
import com.akumasoft.request.CreateTripRequest;


@Repository
public interface TripRepository extends JpaRepository<Trip, Long>  {
	List<Trip> getNewPublicTrips();
	List<Trip> findByName(String name);
	List<Trip> findByFirstNameEndsWith(String name);
	Trip createTrip(CreateTripRequest triprq);

}
