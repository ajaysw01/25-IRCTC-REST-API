package com.aj.service;

import com.aj.request.Passenger;
import com.aj.response.Ticket;

public interface BookingService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);

}
