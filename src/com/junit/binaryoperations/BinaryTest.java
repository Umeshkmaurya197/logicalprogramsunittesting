package com.junit.binaryoperations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTest {

	@Test
	void testToBinaryOperation() {
		assertEquals("00000100",Binary.toBinaryOperation(64));
		
	}

}
