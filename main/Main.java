package main;

import entity.Auto;
import service.Parking;

public class Main {

	public static void main(String[] args) {
		
		Auto auto = new Auto();
//		auto.setMark("Honda");
//		auto.setModel("Accord");
//		auto.setColour("black");
		Parking parking = new Parking();

//		parking.carLeaving(15);

		System.out.println(parking.ammountCarsByColour("white"));
		System.out.println(parking.ammountCarsByModel("Accord"));
		System.out.println(parking.ammountCarsByMark("Alfa Romeo"));
		System.out.println(parking.ammountCars());
	}

}
