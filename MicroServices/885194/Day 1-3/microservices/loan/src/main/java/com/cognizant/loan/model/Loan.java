package com.cognizant.loan.model;

public class Loan {

	private long number;
	private String type;
	private int loan;
	private double emi;
	private int tenure;
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLoan() {
		return loan;
	}
	public void setLoan(int loan) {
		this.loan = loan;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public Loan(long number, String type, int loan, double emi, int tenure) {
		super();
		this.number = number;
		this.type = type;
		this.loan = loan;
		this.emi = emi;
		this.tenure = tenure;
	}
	@Override
	public String toString() {
		return "Loan [number=" + number + ", type=" + type + ", loan=" + loan + ", emi=" + emi + ", tenure=" + tenure
				+ "]";
	}
	
	
}
