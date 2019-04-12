package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumber {

	@Test
	void test() {
		jUnitFunction jUnit = new jUnitFunction();
		int result= jUnit.addNumber(100, 200);
		assertEquals(300,result);
	}

}
