package com.alojea;

public class DaysOfTheWeek {
	
	public static String newDayAfterDaysLater(String currentDay, Integer daysLater) {
		String[] weekDays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int currentDayIndex = 0;
		
		for(int index = 0; index < 7; index++) {
			if(weekDays[index].equals(currentDay)) {
				currentDayIndex = index;
			}
		}
		
		for(int countDays = 0; countDays < daysLater ; countDays++) {
			currentDayIndex++;
			
			if(currentDayIndex >= 7) {
				currentDayIndex = 0;
			}
		}
		
		return weekDays[currentDayIndex];
	}

}
