package modelTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


import model.Calculator;

class CalculatorTest {

	@Test
	void testSumtwoPositiveInegers() {
		
		int firstInput = 3;
		int secondInput = 7;
		
		int expectedOutput = 10;
		
		int actualOutput = Calculator.sum(firstInput, secondInput);
		
		Assert.assertEquals(expectedOutput, actualOutput);
	}

}
