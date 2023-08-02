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

}
