package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import module5.Appointment;
import module5.AppointmentService;

class ApptServiceTest {
	String apptID;
	Date date;
	String apptDes; 
	private ArrayList<Appointment> appointments; 
	
	@Test
	public void testAddAppointment() {
		AppointmentService aService = new AppointmentService();
		String apptID = "12345";
		Date date = new Date (2021, 3, 3);
		boolean ok; 
		ok = aService.addAppt(apptID, date, "appointment description");
		Assertions.assertTrue(ok);
	}
	@Test
	public void testAddAppointmentNull() {
		String apptID = null;
		Date date = new Date(2021, 3, 3);
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Appointment(apptID, date, "appointment description");
		});}
	@Test 
	public void testPastDate() {
		String apptID = "12345";
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		int year = 2020;
		int month = 11;
		int day = 31;
		int hour = 0;
		int minute = 0;
		int second = 0;
		cal.set(year, month, day, hour, minute, second);
		Date date = cal.getTime();
		//Date date = new Date(2020, 3, 3);
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Appointment(apptID, date, "appointment description");
		});}
	@Test
	public void testRemoveAppt() {
		AppointmentService aService = new AppointmentService();
		String apptID = "12345";
		Date date = new Date (2021, 3, 3);
		boolean ok; 
		ok = aService.addAppt(apptID, date, "appointment description");
		Assertions.assertTrue(ok);
		ok = aService.removeAppt(apptID);
		Assertions.assertTrue(ok);
	}

}
