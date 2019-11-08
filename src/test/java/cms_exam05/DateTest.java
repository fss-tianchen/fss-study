package cms_exam05;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

import com.bawei.myTest.DateUtils;

public class DateTest {

	@Test
	public void testDate() {
		DateUtils.compare(null, new Date());
	}

	@Test
	public void calculateAgeTest() {
		Date date = new Date();
		assertTrue(0==DateUtils.calculateAge(date));
		
		Date date2 = new Date(12, 9, 21);
		int age = DateUtils.calculateAge(date2);
		
		System.out.println("age is "+age);
	}
	
	@Test
	public void remainDaysTest() {
		Date date = new Date();
		assertTrue(0==DateUtils.calculateAge(date));
		
		Date date2 = new Date(100, 9, 21);
		int days = DateUtils.calculateAge(date2);
		
		System.out.println("days is "+days);
	}
}
