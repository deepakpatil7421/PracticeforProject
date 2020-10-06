package com.example.demoudemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoudemy.model.VehicleDTO;

@Repository
public interface ParkingRepository extends JpaRepository<VehicleDTO, Long> {

}
