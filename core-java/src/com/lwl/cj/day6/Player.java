package com.lwl.cj.day6;

public class Player {

	 String name;
	 String role;
	 String country;
	 double amount;
	 String team;
	
	 public Player(String name, String role, String country, double amount, String team) {
		super();
		this.name = name;
		this.role = role;
		this.country = country;
		this.amount = amount;
		this.team = team;
	}
	 
    public void show() {
    	System.out.println(name+" "+role+" "+amount+" "+country+" "+team);
    }
}
