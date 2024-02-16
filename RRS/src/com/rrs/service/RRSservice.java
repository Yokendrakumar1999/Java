package com.rrs.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.rrs.entity.Customer;

public interface RRSservice {

	LinkedHashMap<Integer, Customer> ac=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer> nonAc=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer> deluxe=new LinkedHashMap<Integer, Customer>();
	ArrayList<Customer> l1=new ArrayList<Customer>();
	
	void roomInfo();
	void checkAvailability();
	void checkIn();
	void checkOut();
	void allocate(LinkedHashMap<Integer, Customer> m,double camt,String roomType,int roomno);
	
}
