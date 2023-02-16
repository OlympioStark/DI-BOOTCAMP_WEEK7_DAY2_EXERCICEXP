package Exercice3;

import java.text.DecimalFormat;

public class Account extends Customer {
	
	private int id;
	private Customer customer;
	private double balance = 0.0;
	
	public Account(int id, String name, char gender, int id2, Customer customer, double balance) {
		super(id, name, gender);
		id = id2;
		this.customer = customer;
		this.balance = balance;
	}
	
	public Account(int id, String name, char gender, int id2, Customer customer) {
		super(id, name, gender);
		id = id2;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return this.customer.toString() + "balance= $" + df.format(balance);
	}
	
	public String getCustomerName() {
		return this.customer.getName();
	}
	
	public Account deposit(double amount) {
		double newBalance = balance + amount;
		this.balance = newBalance;
		return this;
	}
	
	public Account withdraw(double amount) {
		if (this.balance >= amount) {
			double newBalance = balance - amount;
			this.balance = newBalance;
		} else {
			System.out.println("Amount withdrawn\n" +
							"exceeds the current balance");
		}
		return this;
	}

}
