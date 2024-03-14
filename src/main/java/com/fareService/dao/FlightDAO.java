package com.fareService.dao;

import java.util.List;

import com.fareService.entity.Flight;

public interface FlightDAO {

	List<Flight> getAllFlights();

	Flight getFlightById(Long id);

	Flight save(Flight theFlight);

	void deleteById(int id);

}