package com.example.Model;

public class CalculatorModel {
	
	private int calculation;
	public void add(int left, int right) {
		
		
		calculation = left + right;
	}
	
	public int getValue() {
		
		return calculation;
		
	}

}
