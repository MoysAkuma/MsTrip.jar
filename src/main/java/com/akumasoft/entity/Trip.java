package com.akumasoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.akumasoft.request.CreateTripRequest;

import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "trips")
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long TripID;
	
	@Column(name = "Name")
	private String Name;
	
	@Column(name = "OwnerID")
	private Long OwnerID;
	
	@Column(name = "Ubication")
	private String Ubication;
	
	@Column(name = "DepartureCountry")
	private Long DepartureCountry;
	
	@Column(name = "DepartureCity")
	private Long DepartureCity;
	
	@Column(name = "DepartureDate")
	private String DepartureDate;
	
	@Column(name = "AdminID")
	private Long AdminID;
	
	@Column(name = "CreatorID")
	private Long CreatorID;
	
	@Column(name = "CountryList")
	private String CountryList;
	
	@Column(name = "StateList")
	private String StateList;
	
	@Column(name = "CityList")
	private String CityList;
	
	@Transient
	private String OwnerName; 
	public Trip(CreateTripRequest t) {
		this.TripID = t.getID();
		this.Name = t.getName();
		this.OwnerID = t.getOwnerID();
		this.Ubication = t.getUbication();
		this.DepartureCountry = t.getDepartureCountry();
		this.DepartureCity = t.getDepartureCity();
		this.DepartureDate = t.getDepartureDate();
		this.AdminID = t.getAdminID();
		this.CreatorID = t.getCreatorID();
		this.CountryList = t.getCountryList();
		this.StateList = t.getStgateList();
		this.CityList = t.getCityList();
		this.OwnerName = "";
	}
}
