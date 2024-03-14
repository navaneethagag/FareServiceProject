package com.fareService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="flight_name")
    private String flightName;
    
    @Column(name="source")
    private String source;
    
    @Column(name="destination")
    private String destination;
    
    @Column(name="doj")
    private String doj; // Date of Journey
    
    @Column(name="available_seats")
    private int availableSeats;
    
    @Column(name="ticket_price")
    private double ticketPrice;
    
    @Column(name="flight_class")
    private String flightClass;
    // Constructors, getters, and setters
	public Flight() {
		super();
	}
	public Flight(String flightName, String source, String destination, String doj, int availableSeats,
			double ticketPrice, String flightClass) {
		super();
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.doj = doj;
		this.availableSeats = availableSeats;
		this.ticketPrice = ticketPrice;
		this.flightClass = flightClass;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getFlightClass() {
		return flightClass;
	}
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

   
    
}
