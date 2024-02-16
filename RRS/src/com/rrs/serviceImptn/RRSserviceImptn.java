package com.rrs.serviceImptn;

import java.util.LinkedHashMap;
import java.util.Scanner;

import com.rrs.entity.Address;
import com.rrs.entity.Customer;
import com.rrs.service.RRSservice;

public class RRSserviceImptn implements RRSservice {

	{
		for(int i=101;i<108;i++)
		{
			ac.put(i, null);
		}
	}

	@Override
	public void roomInfo() {
		System.out.println("=========Room Details============");
		System.out.println("==========AC Rooms=============");
		System.out.println("1.AC\n2.TV\n3.WIFI\n4.Fridge");
		System.out.println("Price:2500/day");

	}


	@Override
	public void checkAvailability() {
		System.out.println("======Ac Rooms=====");
		int c=0;
		for(int key:ac.keySet()) {   //[101.102,....108]
			if(ac.get(key)==null)
			{
				System.out.print(key+" ");
				c++;
			}
		}
		if(c==0) {
			System.out.println(" All room are occupied....!");
		}
		System.out.println();
	}
	Scanner s=new Scanner(System.in);
	@Override
	public void checkIn() {
		System.out.println("=======Check-In=====");
		System.out.println("====Room Details===");
		System.out.println("1.AC\n2.Non-AC\n3.Deluxe");
		System.out.println("Enter your Option:-");
		int op=s.nextInt();
		System.out.println("Please enter the room:-");
		int roomno=s.nextInt();
		switch (op) {
		case 1: if(ac.containsKey(roomno)&&ac.get(roomno)==null) {
			allocate(ac,2500,"Ac" ,roomno);
			System.out.println("Allocate");
		}
		else {
			System.out.println("Invalid roomno or room is not available..");
		}

		break;
		case 2: if(nonAc.containsKey(roomno)&&nonAc.get(roomno)==null) {
			allocate(nonAc,2500,"Non-AC" ,roomno);
		}
		break;
		case 3:System.out.println("Need to be Implented...!");

		break;

		default:System.out.println("Invaild Option...!");
		break;
		}    
	}





	@Override
	public void allocate(LinkedHashMap<Integer, Customer> m, double camt, String roomType,int roomno) {
		System.out.println("======Customer Details======");
		System.out.println("Please Enter Customer Id:-");
		int cid=s.nextInt();
		System.out.println("Please Enter Customer Name:-");
		String cname=s.next();
		System.out.println("Please Enter Customer Phone No:-");
		long phone=s.nextLong();
		System.out.println("Please Enter the house No:-");
		String houseno=s.next();
		System.out.println("Please Enter the Street Name:-");
		String streetName=s.next();
		System.out.println("Please Enter Location pincode:-");
		int pin=s.nextInt();
		Address a=new Address(houseno, streetName, pin);
		Customer c=new Customer(cid, cname, phone, a, camt, roomType);
		l1.add(c);
		m.put(roomno, c);
		System.out.println(c.getCname()+" had allocate for "+roomType+" RoomNo:"+roomno);
        System.out.println("please ");
	}


	public void checkOut() {
		System.out.println("=======Check-out=====");
		System.out.println("====Room Details===");
		System.out.println("1.AC\n2.Non-AC\n3.Deluxe");
		System.out.println("Enter your Option:-");
		int op=s.nextInt();
		System.out.println("Please enter the room:-");
		int roomno=s.nextInt();
		System.out.println("ples Customer id");
		int cid =s.nextInt();
		switch (op) {
		case 1:if(ac.containsKey(roomno)&&ac.get(roomno)!=null&&ac.get(roomno).getCid()==cid) {
			System.out.println(ac.get(roomno).getCname()+" Thanks for visiting...!");
			   ac.put(roomno, null);	
		}
		else {
			System.out.println("invalid cred");
		}
			break;

		default:
			break;
		}
		
	}
}
