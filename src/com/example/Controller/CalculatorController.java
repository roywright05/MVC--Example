package com.example.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.example.Model.CalculatorModel;
import com.example.View.CalculatorView;

public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		super();
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculationListener(new CalculateListener());
		
	}
	
	class CalculateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent args0) {
			
			int firstNumber, secondNumber = 0;
			
			try {
				
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.add(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getValue());
				
			}catch(NumberFormatException e) {
				
				theView.displayErrorMessage("You must enter two integer values!");
			}
			
		}
		
		
		
		
	}
	
	

}
