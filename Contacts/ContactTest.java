package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import module3.Contact;

@SuppressWarnings("unused")
class ContactTest {
	@Test
	void testContact() {
		Contact contact = new Contact("12345", "first name", "last name", "phone", "address");
		assertTrue(contact.getContactID().equals("12345"));
		assertTrue(contact.getFirstName().equals("first name"));
		assertTrue(contact.getLastName().equals("last name"));
		assertTrue(contact.getPhone().equals("phone"));
		assertTrue(contact.getAddress().equals("address"));
	}

	@Test
	void testContactNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact(null, "first name", "last name", "phone", "address");
	});}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("12345", null, "last name", "phone", "address");
	});}
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("12345", "first name", null, "phone", "address");
	});}
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("12345", "first name", "last name", "phone", null);
	});}
	@Test 
	void testPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("12345", "first name", "last name", null, "address");
	});}
	
	@Test
	void testContactLimit() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("01234567891", "012345", "012345","12345", 
					"0123 Java RD, NYC, New York" );
		});}
	@Test
	void testFirstNameLimit() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("012345", "01234567891", "012345","12345", 
					"0123 Java RD, NYC, New York" );
		});}
	@Test
	void testLastNameLimit() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("012345", "012345", "01234567891","12345", 
					"0123 Java RD, NYC, New York" );
		});}
	@Test
	void testPhoneLimit() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("012345", "012345", "012345","12345678911", 
					"0123 Java RD, NYC, New York" );
		});}
	@Test
	void testAddressLimit() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("012345", "012345", "012345","1234567891", 
					"0123 Java Code Avenue, New York City, New York" );
		});}
	}
