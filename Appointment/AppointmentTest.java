package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import module5.Appointment;

class AppointmentTest {

	
	@Test
	void testAppointment() {
		Date date = new Date (2021, 3, 3);
		
		Appointment appt = new Appointment("12345", date, "appointment description" );
		assertTrue(Appointment.getApptID().equals("12345"));
		assertTrue(Appointment.getApptDes().equals("appointment description"));
		assertTrue(Appointment.getDate().equals(new Date(2021, 3, 3)));
	}
	
	@Test
	void testDateNull() {
		Date date = null;
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Appointment("12345", date, "appointment description");
		});}
	
	@Test
	void testPastDate() {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(0);
		int minute = 0;
		int hour = 0;
		int day = 31;
		int month = 11;
		int year = 2020;
		int second = 0;
		cal.set(year, month, day, hour, minute, second);
		Date date = cal.getTime();
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment("12345", date, "appointment description");
		});}
	
	@Test
	void testApptDesNull() {
		Date date = new Date(2021, 3, 3);
	Assertions.assertThrows(IllegalArgumentException.class, () ->{
		new Appointment("12345", date, null);
	});}
	@Test
	void testApptIDLimit() {
		Date date = new Date(2021, 3, 3);
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment("12345678902", date, "appointment description");
		});}
	
	@Test
	void testApptIDNull() {
		Date date = new Date(2021, 3, 3);
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment(null, date, "appointment description");
		});}
	
}
