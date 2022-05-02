package jUnitTesting;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;




	import static org.junit.Assert.assertTrue;
	import static org.junit.jupiter.api.Assertions.*;

	import java.util.ArrayList;
	import java.util.List;

	import org.junit.jupiter.api.Assertions;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;

	import module3.Contact;
	import module3.ContactService;

	class ContactServiceTest {
		String firstName = "person";
		String lastName = "last name";
		String phone = "number" ;
		String address = "place";
		String contactID;
		private ArrayList <Contact> contacts;
		
		
		
		@Test 
		public void testAddContact() {
          ContactService service = new ContactService();
			String contactID = "123456";
          boolean ok;
          
			ok = service.addContact(contactID, "person", "last name", "phone", "address");
			Assertions.assertTrue(ok);
        		
		}
		@Test
		public void testAddContactNull() {
			
			String contactID = null;
			
			Assertions.assertThrows(IllegalArgumentException.class,()->{
				new Contact(contactID, "Person", "last name", "phone", "address");
			});
		}
		@Test
		public void testDeleteContact() {
			ContactService service = new ContactService();
			String contactID = "123456";
          boolean ok;
        
			ok = service.addContact(contactID, "person", "last name", "phone", "address");
			Assertions.assertTrue(ok);
          
			ok = service.removeContact(contactID);
			Assertions.assertTrue(ok);
        
		}
		@Test
		public void testUpdateContact() {
          ContactService service = new ContactService();
          String contactID = "123456";
          boolean ok;
        
			ok = service.addContact(contactID, "person", "last name", "phone", "address");
			Assertions.assertTrue(ok);
          
           
          ok = service.updateContact(contactID, "person2", "last name2", "phone2", "address2");
          Assertions.assertTrue(ok);	
		}
	}
