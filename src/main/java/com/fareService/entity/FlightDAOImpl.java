package com.fareService.entity;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fareService.dao.FlightDAO;


import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class FlightDAOImpl implements FlightDAO {

    // define field for entitymanager
    private EntityManager entityManager;


    // set up constructor injection
    @Autowired
    public FlightDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

	public List<Flight> getAllFlights() {

        // create a query
        TypedQuery<Flight> theQuery = entityManager.createQuery("from Flight", Flight.class);

        // execute query and get result list
        List<Flight> flights = theQuery.getResultList();

        // return the results
        return flights;
	}


	public Flight getFlightById(Long id) {
		// get employee
		Flight theFlight = entityManager.find(Flight.class, id);

        // return employee
        return theFlight;
	}
	@Override
    public Flight save(Flight theFlight) {

        // save employee
		Flight dbFlight = entityManager.merge(theFlight);

        // return the dbEmployee
        return dbFlight;
    }
	 @Override
	    public void deleteById(int id) {

	        // find employee by id
		 Flight theFlight = entityManager.find(Flight.class, id);

	        // remove employee
	        entityManager.remove(theFlight);
	    }


	


	


}