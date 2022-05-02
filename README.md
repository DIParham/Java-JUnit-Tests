# Java-JUnit-Tests

## Projects:

[Appointment](https://github.com/DIParham/Java-JUnit-Tests/tree/gh-pages/Appointment)
[Tasks](https://github.com/DIParham/Java-JUnit-Tests/tree/gh-pages/Tasks)
[Contacts](https://github.com/DIParham/Java-JUnit-Tests/tree/gh-pages/Contacts)

### Project Overview:
This compilation of projects utilizes white-box testing, JUnit tests, to ensure the functionality and quality of the Appointment, Contact, and Tasks projects. 

The primary approach taken towards writing these Junit tests revolved around providing the software results and behavior expected of the project. In terms of the Contact Class and Task Class, it was expected that the variables should not be null, nor should they exceed their character limits. As for the Appointment Class, it was also a requirement that the date should not be set in the past. At the same time, the ID variables cannot be updated by the user. To meet these expectations, the classes were designed to throw Illegal Argument Exceptions if certain specifications were not met. 

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
 
The Contact Class depicts the conditions these variables must meet to utilize the program. If a user were to set a variable as null or with too many characters, it is expected to throw Illegal Argument Exceptions. With this in mind, Junit tests were constructed that produced the expected outcome if these conditions were not met.

	@Test
	void testContactNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact(null, "first name", "last name", "phone", "address");
	});}
	@Test
	void testAddressLimit() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact ("012345", "012345", "012345","1234567891", 
					"0123 Java Code Avenue, New York City, New York" );
		});}

The Junit tests were written to expect the Illegal Argument Exceptions to be thrown. The variables are either null or exceed their character limit, this ensures that the software meet the requirements. Another Junit test were conducted to ensure that variables that met the specifications were passed and did not throw Illegal Argument Exceptions. 

	@Test
	void testContact() {
		Contact contact = new Contact("12345", "first name", "last name", "phone", "address");
		assertTrue(contact.getContactID().equals("12345"));
		assertTrue(contact.getFirstName().equals("first name"));
		assertTrue(contact.getLastName().equals("last name"));
		assertTrue(contact.getPhone().equals("phone"));
		assertTrue(contact.getAddress().equals("address"));
	}

An overview of the test results demonstrate that all the tests have passed and that the software complies to with the requirements.

![image](https://user-images.githubusercontent.com/79165798/166301867-0d614226-8854-4719-bf3f-5f42b84c7419.png)

The Service Classes were a bit more complex. For these tests I wanted to ensure that we were able to add, update and remove from the arraylists. To accomplish these functions, I focused on the simpler methods and worked my way down to the more difficult methods. The primary focus of the Junit tests was to make sure the functions operated as expected. Not only did the Junit tests determine that these functions worked as expected but it also checked whether it threw an Illegal Argument Exception if one of the variables were null,  exceeded their character limit, or the date was invalid.

	public boolean addTask(String taskID, String taskName, String taskDes) {
		Task task = new Task(taskID, taskName, taskDes);
			tasklist.add(task);
			return true;			
	}			
	public boolean removeTask(String taskID) {
		for(Task task : tasklist) {
			if(task.getTaskID().equals(taskID)) {
				tasklist.remove(task);
				return true;
			}else {
				throw new IllegalArgumentException("Invalid Task ID or Task does not exist");
			}	
		}
		return false;
	}
	public boolean updateTask(String taskID, String taskName, String taskDes) {
		for(Task task : tasklist) {
			if (task.getTaskID().equals(taskID)) {
				task.setTaskName(taskName);
				task.setTaskDes(taskDes);		
				return true;
			}else {
				throw new IllegalArgumentException("Invalid Task ID or Task does not exist");
			}
		}
		return false;
		
The Junit tests were designed to return true when the specifications had been met. In the instance these specifications were not met, the tests were designed to throw Illegal Argument Exceptions.

In this portion of the ApptService Test, it depicts the remove function of the program. As stated before, these programs designed to throw Illegal Argument Exceptions if conditions are not met. However, if conditions are met, the program is able to proceed with the programmed functions, such as remove() or add(). This helps to ensure that the requirement specifications are followed. For example, the program threw Illegal Argument Exception when the apptID is null. When the apptID was not null, the program proceeded to remove the appointment with the associated apptID.

![image](https://user-images.githubusercontent.com/79165798/166302528-33e5b7e7-1aba-45a3-8735-b89f082e118c.png)

The Junit tests were rather effective in the testing of Service Classes. The coverage percentage determines whether a Junit test effectively tested a class. It is optimal to have the highest percentage achievable. A high coverage percentage is an indication that the Junit test was effective in testing the project. Based on the coverage percentage of the ContactService Test,  it covered 95.1% of the ContactService Class. This indicates that the test sufficiently covered the testing target. 

![image](https://user-images.githubusercontent.com/79165798/166302676-9945acee-09c0-4b69-a1f7-01641d807763.png)

The Junit testing results for the AppointmentService class showcased a 95.7% coverage. As stated previously, a high percentage is an indication that a Junit test effectively tested a class or project. In the AppointmentService class, in particular, the Junit test covered 45 out of 47 instructions in the class. 

![image](https://user-images.githubusercontent.com/79165798/166302741-767082c2-aa79-4966-a20e-7b250c9bd71e.png)

As for the TaskService Test, it covered 83.1% of the TaskService Class, which is adequate coverage. With this percentage, the TaskService Test did not cover as much as the ContactService and the ApptService Test did. The Junit coverage percentage indicates that 69 out of 83 instructions were effectively covered through the testing.

![image](https://user-images.githubusercontent.com/79165798/166302887-57343243-add2-4232-b970-0837e4b4d8ef.png)

I ensured that my code was technically sound by analyzing and fixing any issues that the Junit tests indicated. For example, a syntax error in the updateTask method was indicated by the TaskService Test.    

![image](https://user-images.githubusercontent.com/79165798/166302977-ef83dc2f-9a4b-49b1-9ec6-e715ab912327.png)

The error produced by the Junit test indicated that the task.getTaskID was null. Further analysis of the code shown that the error was caused by invalid syntax usage. The if statement in the updateTask method used invalid syntax which prevented the getTaskID from retrieving the taskID. This issue was resolved by fixing the syntax: 

	if (task.getTaskID().equals(taskID))
	
In doing so, it allowed the task.getTaskID() to retrieve the taskID and continue on with the method.
	
