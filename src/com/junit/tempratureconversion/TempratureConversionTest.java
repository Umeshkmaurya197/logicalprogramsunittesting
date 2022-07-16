package com.junit.tempratureconversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempratureConversionTest {

	@Test
	void testFToC() {
		assertEquals(-17.22222222222222,TempratureConversion.tempratureConversionFToC(1.0));
	}
	@Test
	void testCToF() {
		assertEquals(33.8000,TempratureConversion.tempratureConversionCToF(1.0));
	}

}
