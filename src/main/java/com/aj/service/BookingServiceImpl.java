package com.aj.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.aj.request.Passenger;
import com.aj.response.Ticket;

@Service
public class BookingServiceImpl implements BookingService {

	
	private Map<Integer, Ticket> ticketMap = new HashMap<>();
	
	private Integer ticketNum =101;
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		//logic
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketCost(550.00);
		t.setStatus("CONFIRMED");
		t.setTicketNum(ticketNum);
		ticketMap.put(ticketNum, t);
		ticketNum ++;
		System.out.println(ticketMap);

		return t; 
	
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {

		if(ticketMap.containsKey(ticketNumber)) {
			return ticketMap.get(ticketNumber);
		}
		return null;
	}

}
