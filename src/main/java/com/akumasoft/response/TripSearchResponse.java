package com.akumasoft.response;
import com.akumasoft.entity.Trip;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TripSearchResponse {
	@JsonProperty("TripID")
	private Long ID;
	
	@JsonProperty("TripName")
	private String Name;
	
	private Long OwnerID;
	
	private String Ubication;
	
	private Long DepartureCountry;
	
	private Long DepartureCity;
	
	private String DepartureDate;
	
	private String CountryList;
	
	public TripSearchResponse(Trip t) {
		this.ID = t.getTripID();
		this.Name = t.getName();
		this.OwnerID = t.getOwnerID();
		this.Ubication = t.getUbication();
		this.DepartureCountry = t.getDepartureCountry();
		this.DepartureCity = t.getDepartureCity();
		this.DepartureDate = t.getDepartureDate();
		this.CountryList = t.getCountryList();
	}
	
}
