import static org.junit.Assert.*;

import org.junit.Test;

import app.Calculator;

public class CalculatorTests {

	@Test
	public void testAdd() {
	   int exp = 30;
	   Calculator cal = new Calculator();
	   int act = cal.add(10, 20);
	   assertEquals(exp, act);
	}

	public void testDivide(){
		  int exp = 20;
		   Calculator cal = new Calculator();
		   int act = cal.divide(20, 20);
		assertEquals(exp, act);
		
	}
	}


