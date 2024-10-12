package com.akumasoft.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateTripRequest {
	@JsonProperty("TripID")
	private Long ID;
	
	@NotBlank(message = "Trip Name is required")
	private String Name;
	
	@NotBlank(message = "Owner is required")	
	private Long OwnerID;
	
	@NotBlank(message = "Ubication is required")	
	private String Ubication;
	
	@NotBlank(message = "Departure Country is Required")	
	private Long DepartureCountry;
	
	@NotBlank(message = "Departure City is Required")	
	private Long DepartureCity;
	
	@NotBlank(message = "Departure Date is Required")	
	private String DepartureDate;
	
	@NotBlank(message = "Admin is required")	
	private Long AdminID;
	
	@NotBlank(message = "Creator is required")	
	private Long CreatorID;
	
	@NotBlank(message = "Country List is required")	
	private String CountryList;
	
	@NotBlank(message = "State List is required")	
	private String StgateList;
	
	@NotBlank(message = "City List is required")	
	private String CityList;
}
