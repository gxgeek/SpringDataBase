package com.gx.model;


public class Account {
	private long id;
	private long userId;
	private double balance;

	public void setId(long id) {
		this.id = id;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getId() {
		return id;
	}

	public long getUserId() {
		return userId;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", userId=" + userId +
				", balance=" + balance +
				'}';
	}
}
