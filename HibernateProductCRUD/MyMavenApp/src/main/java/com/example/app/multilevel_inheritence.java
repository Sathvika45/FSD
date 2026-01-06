package com.example.app;

	class Vehicle {
	void start() {
	  System.out.println("Vehicle Started");
	}
	}
	class Car extends Vehicle{
	  void start() {
	    System.out.println("Driving Car");
	  }
	}
	class ElectricCar extends Vehicle{
	  void start() {
	    System.out.println("Electric Car charged");
	  }
	}

		public class multilevel_inheritence {
	  public static void main(String[] args) { 
	     Vehicle v1 = new Car();
	         v1.start();
	          Vehicle v2 = new ElectricCar();
	          v2.start();
	  }
	}


