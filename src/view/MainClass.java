package view;

import controler.CalculatorControler;

public class MainClass {

	public static void main(String[] args) {
		CalculatorControler sys = new CalculatorControler();
		int option = -1;
        do {
            System.out.println("0: QUIT");
            System.out.println("1: sum");
            option = Input.getInteger("Option:");
            switch (option) {
            	case 0:
            		System.exit(0);
            		break;
            	case 1:
            		Integer a = Input.getInteger("Please enter the first integer: ");
            		Integer b = Input.getInteger("Please enter the second integer: ");
            		int output = sys.sum(a, b);
            		System.out.println("The ouput is: "+ output);
            		break;
            }
        }
        while (option != 0);
        
	}

}
