package com.ophem.bpapp.model;

public class CardNumber {

	private String first, second, third, fourth;

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	public String getThird() {
		return third;
	}

	public void setThird(String third) {
		this.third = third;
	}

	public String getFourth() {
		return fourth;
	}

	public void setFourth(String fourth) {
		this.fourth = fourth;
	}

	@Override
	public String toString() {
		return getFirst()+"-"+getSecond()+"-"+getThird()+"-"+getFourth();
	}
	
	
}
