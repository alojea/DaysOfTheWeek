package com.alojea;

import org.junit.Assert;
import org.junit.Test;

public class DaysOfTheWeekTest {

	@Test
	public void example1() {
		Assert.assertEquals("Wednesday",DaysOfTheWeek.newDayAfterDaysLater("Monday", 2));
	}
	
	@Test
	public void example2() {
		Assert.assertEquals("Monday",DaysOfTheWeek.newDayAfterDaysLater("Saturday", 23));
	}

}
