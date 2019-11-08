package com.bawei.myTest;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	
	public static int compare(Date date1, Date date2) {
		if(date1 == null || date2 == null) {
			throw new RuntimeException("参数不能为空");
		}
		return date1.compareTo(date2);
	}
	
	/**
	 * 
	 * @Title: calculateAge 
	 * @Description: 计算年龄
	 * @param birthday
	 * @return
	 * @return: int
	 */
	public static int calculateAge(Date birthday) {
		if(birthday.compareTo(new Date())>0) {
			throw new RuntimeException("给定的日期不能大于当前日期" + birthday);
		}
		
		//获取参数的年、月、日
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(birthday);		
		int bdYear = calendar.get(Calendar.YEAR);
		int bdMonth = calendar.get(Calendar.MONTH);
		int bdDay = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("bdYear: " + bdYear + "bdMonth: " + bdMonth + "bdDay: " + bdDay);
		
		//过去现在时间的年、月、日
		calendar.setTime(new Date());
		int currentYear = calendar.get(Calendar.YEAR);
		int currentMonth = calendar.get(Calendar.MONTH);
		int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("currentYear: " + currentYear + "currentMonth: " + currentMonth + "currentDay: " + currentDay);
		
		int age = currentYear - bdYear;
		if(bdMonth > currentMonth) {
			age--;
		}else if(bdDay > currentDay	&& bdMonth == currentMonth) {
			age--;
		}
		return age;
	}
}
