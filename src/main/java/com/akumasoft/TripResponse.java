package com.akumasoft;

import com.akumasoft.entity.Trip;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TripResponse {
	
	@JsonProperty("TripID")
	private long ID;

	@JsonProperty("TripName")
	private String Name;

	@JsonProperty("OwnerID")
	private Long OwnerID;
	
	@JsonProperty("Ubication")
	private String Ubication;
	
	@JsonProperty("DepartureCountry")
	private Long DepartureCountry;
	
	@JsonProperty("DepartureCity")
	private Long DepartureCity;
	
	@JsonProperty("DepartureDate")
	private String DepartureDate;
	
	@JsonProperty("AdminID")
	private Long AdminID;
	
	@JsonProperty("CreatorID")
	private Long CreatorID;
	
	@JsonProperty("CountryList")
	private String CountryList;
	
	@JsonProperty("StateList")
	private String StateList;
	
	@JsonProperty("CityList")
	private String CityList;
	
	public TripResponse (Trip trip) {
		this.ID = trip.getTripID();
		this.Name = trip.getName();
		this.OwnerID = trip.getOwnerID();
		this.Ubication = trip.getUbication();
		this.DepartureDate = trip.getDepartureDate();
		this.AdminID = trip.getAdminID();
		this.CreatorID = trip.getCreatorID();
		this.CountryList = trip.getCountryList();
		this.StateList = trip.getStateList();
		this.CityList = trip.getCityList();
		this.DepartureCountry = trip.getDepartureCountry();
		this.DepartureCity = trip.getDepartureCity();
	}
}

