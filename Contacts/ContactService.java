package module3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ContactService {
	private List <Contact> contacts;

	
	public ContactService() {
		contacts = new ArrayList <Contact>();
	}
	public boolean addContact(String contactID, String firstName, String lastName, String phone, String address) {
		
		Contact contact = new Contact(contactID, firstName, lastName, phone, address);
		
       	contacts.add(contact);
        return true;
	      
	}
	
	public boolean removeContact(String contactID) {
		for(Contact contact : contacts) {
			if(contact.getContactID().equals(contactID)) {
				contacts.remove(contact);
				return true;
			}
		}
		return false;
	}
	public boolean updateContact(String contactID, String firstName, String lastName, String phone, String address) {
		for(Contact contact : contacts) {
			if(contact.getContactID().equals(contactID)) {
				contact.setFirstName(firstName);
				contact.setLastName(lastName);
				contact.setPhone(phone);
				contact.setAddress(address);
                return true;
			}
		}
      // contactID does not exist
      return false;
	}
		

}
