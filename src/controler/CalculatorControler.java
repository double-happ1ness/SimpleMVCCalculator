package controler;

import model.Calculator;

public class CalculatorControler {
	private Calculator modelCalc;
	
	public CalculatorControler() {
		this.modelCalc = new Calculator();
	}
	
	public int sum(int a, int b) {
		return modelCalc.sum(a,b);
	}

}
