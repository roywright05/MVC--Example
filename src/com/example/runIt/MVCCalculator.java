package com.example.runIt;

import com.example.Controller.CalculatorController;
import com.example.Model.CalculatorModel;
import com.example.View.CalculatorView;

public class MVCCalculator {

	public static void main(String[] args) {
		
		CalculatorView theView = new CalculatorView();
		
		CalculatorModel theModel = new CalculatorModel();
				
		CalculatorController theController = new CalculatorController(theView, theModel);
		
		theView.setVisible(true);
	}

}
