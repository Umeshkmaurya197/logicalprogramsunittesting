package com.junit.monthlypayment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonthlyPaymentTest {

	@Test
	void test() {
		assertEquals(2.313322159798367E-50,MonthlyPayment.monthlyPayment(80000, 2, 7.9));
	
	}

}
