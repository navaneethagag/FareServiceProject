package com.fareService.service;

import java.util.List;

import com.fareService.entity.Flight;

public interface FlightService {
	List<Flight> getAllFlights();

	Flight getFlightById(Long id);

	Flight save(Flight theFlight);

	void deleteById(int id);

}
