package com.example.demoudemy.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demoudemy.model.VehicleDTO;
import com.example.demoudemy.repository.ParkingRepository;
import com.example.demoudemy.service.ParkingService;

public class ParkingServiceImpl implements ParkingService {

	@Autowired
	ParkingRepository parkingRepository;

	@Override
	public List<VehicleDTO> getAllVehicle() {

		return parkingRepository.findAll();
	}

	@Override
	public String park(VehicleDTO vehicleDTO) {
		if (vehicleDTO.getId() > 0 && vehicleDTO.getId() <= 10) {
			parkingRepository.save(vehicleDTO);
		} else {
			throw new RuntimeException("kindly provide id between 1 to 10");
		}

		return "Parked";
	}

	@Override
	public String unpark(Long id) {
		if (id > 0 && id <= 10) {
			parkingRepository.deleteById(id);
		} else {
			throw new RuntimeException("kindly provide id between 1 to 10");
		}

		return "Unparked vehicle at slot number"+id;
	}

}
