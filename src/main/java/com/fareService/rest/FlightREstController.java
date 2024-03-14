package com.fareService.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fareService.entity.Flight;
import com.fareService.service.FlightService;

@RestController
@RequestMapping("/api")
public class FlightREstController {

	private FlightService flightService;

	@Autowired
	
	public FlightREstController(FlightService flightService) {
		super();
		this.flightService = flightService;
	}

	

	// expose "/employees" and return a list of employees
	@GetMapping("/flights")
	public List<Flight> getAllFlights() {
		return flightService.getAllFlights();
	}

	// add mapping for GET /employees/{employeeId}

	@GetMapping("/Flight/{employeeId}")
	public Flight getEmployee(@PathVariable Long id) {

		Flight theFlight = flightService.getFlightById(id);

		if (theFlight == null) {
			throw new RuntimeException("Employee id not found - " + id);
		}

		return theFlight;
	}

	// add mapping for POST /employees - add new employee

	@PostMapping("/employees")
	public Flight addEmployee(@RequestBody Flight theFlight) {

		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update

		theFlight.setId((long) 0);

		Flight dbFlight = flightService.save(theFlight);

		return dbFlight;
	}

}
