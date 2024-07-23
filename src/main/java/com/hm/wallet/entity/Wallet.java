package com.hm.wallet.entity;

public class Wallet {
	
	private Integer id;
	private String name;
	private String email;
	private Double balance;
	private String password;
	
	public Wallet() {
		super();
	}
	
	public Wallet(Integer id, String name, String email, Double balance, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.balance = balance;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Wallet [id=" + id + ", name=" + name + ", email=" + email + ", balance=" + balance + "]";
	}
	
	

}
