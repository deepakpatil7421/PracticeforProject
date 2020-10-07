package com.springboot.parkinglot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class VehicleDTO {

	@Id
	private Long id;
	private String vehicleNumber;
	private String ownerName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
}
