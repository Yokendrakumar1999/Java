package com.rrs.app;

import java.util.Scanner;
import com.rrs.service.RRSservice;
import com.rrs.serviceImptn.RRSserviceImptn;

public class RRSapp {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		RRSservice r=new RRSserviceImptn();
		System.out.println("=======welcome to room rental system========");
		while(true) {
			System.out.println("====Menu====");
			System.out.println("1.RoomInfo\n2.RoomAvailability");
			System.out.println("3.CheckIn\n4.Checkout\n5.Exit");
			System.out.println();
			System.out.println("====Enter Your Option=====");


			int op=s.nextInt();
			switch(op) {
			case 1:
				r.roomInfo();
				System.out.println();
				break;
			case 2:
				r.checkAvailability();
				System.out.println();
				break;
			case 3:
				r.checkIn();
				System.out.println();
				break;
			case 4:
				r.checkOut();
				System.out.println();
				break;
				
			case 5:System.out.println("======Thanks You Visit Again");
			System.out.println();
			System.exit(0);
			break;
			default: System.out.println("=====Invaild Option=====");
			break;
			}
		}
	}
}