package module3;

public class Contact {
	private static String contactID;
	public static String firstName;
	private static String lastName;
	private static String phone; 
	private static String address;
	public Object getContactID;
	
	
	
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid Contact ID");
			
		}
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid Name: Null or Too Many Characters");
		
		}
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Name: Null or Too Many Characters");
			
		}
		if (phone == null || phone.length()>10) {
			throw new IllegalArgumentException("Invalid Phone Number");
			
		}
		if (address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.contactID = contactID; 
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}

	public static String getContactID() {
		return contactID;
	}

	public void setContactID(String contactID) {
		Contact.contactID = contactID;
	}

	public static String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
