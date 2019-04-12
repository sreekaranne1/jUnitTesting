package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddString {

	@Test
	void test() {
		jUnitFunction jUnit = new jUnitFunction();
		String result= jUnit.addString("abc", "def");
		assertEquals("abcdef",result);
		
	}

}
