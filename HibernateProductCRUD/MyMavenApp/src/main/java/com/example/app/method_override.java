package com.example.app;

	class Bank {
	    void interestRate() {
	        System.out.println("Interest Rate: 0%");
	    }
	}
	class SBI extends Bank {
	    void interestRate() {
	        System.out.println("SBI Interest Rate: 3%");
	    }
	}
	class HDFC extends Bank {
	    void interestRate() {
	        System.out.println("HDFC Interest Rate: 4%");
	    }
	}
	public class method_override {
	    public static void main(String[] args) {
	        Bank b1 = new SBI();
	        b1.interestRate();
	        Bank b2 = new HDFC();
	        b2.interestRate();
	        Bank b3 = new Bank();
	        b3.interestRate();
	    }
	}


