package com.akumasoft.response;

import com.akumasoft.entity.Trip;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TripResponse {
	@JsonProperty("TripID")
	private Long ID;
	
	@JsonProperty("TripName")
	private String Name;
	
	private Long OwnerID;
	
	private String Ubication;
	
	private Long DepartureCountry;
	
	private Long DepartureCity;
	
	private String DepartureDate;
	
	private Long AdminID;
	
	private Long CreatorID;
	
	private String CountryList;
	
	private String StateList;
	
	private String CityList;
	
	public TripResponse(Trip trip) {
		this.ID = trip.getTripID();
		this.Name = trip.getName();
		this.OwnerID = trip.getOwnerID();
		this.Ubication = trip.getUbication();
		this.DepartureCountry = trip.getDepartureCountry();
		this.DepartureCity = trip.getDepartureCity();
		this.DepartureDate = trip.getDepartureDate();
		this.AdminID = trip.getAdminID();
		this.CreatorID = trip.getCreatorID();
		this.CountryList = trip.getCountryList();
		this.StateList = trip.getStateList();
		this.CityList = trip.getCityList();
	}
}
