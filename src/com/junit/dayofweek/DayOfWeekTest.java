package com.junit.dayofweek;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class DayOfWeekTest {


	@Test
	void testDayOfWeek() {
		assertEquals("Monday", DayOfWeek.dayOfWeek(11, 7, 2022));
	}
	
}
