package com.junit.toBinary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class toBinaryTest {

	@Test
	void testBinaryOutput() {
		assertEquals("1101101",Binary.toBinary(109) );
		}

}
