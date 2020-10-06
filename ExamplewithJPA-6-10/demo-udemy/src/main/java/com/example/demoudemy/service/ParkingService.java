package com.example.demoudemy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoudemy.model.VehicleDTO;

@Service
public interface ParkingService {

	List<VehicleDTO> getAllVehicle();

	String park(VehicleDTO vehicleDTO);

	String unpark(Long id);

}
