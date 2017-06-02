package com.bridgelabz.SpringTwoClassDependsncy;

public class Details {
	private String address;
	private int pincode;
	private Student student;

	public Details(){}

	public Details(Student student) {
		this.student = student;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Details [address=" + address + ", pincode=" + pincode + " student=" + student + "]";
	}

}
