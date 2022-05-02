package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import module4.Task;

class TaskTest {

	@Test
	void testTask() {
		Task task = new Task("12345", "Java","All about programming");
		assertTrue(task.getTaskID().equals("12345"));
		assertTrue(task.getTaskName().equals("Java"));
		assertTrue(task.getTaskDes().equals("All about programming"));
	}
	@Test
	void testTaskIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Task(null, "Java", "All about programming");
		});
	}
	@Test
	void testTaskNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Task("12345",null, "All about programming");
		});
	}
	@Test 
	void testTaskDesNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Task("12345", "Java", null);
		});
	}
	@Test
	void testTaskIf2Long() {
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			new Task( "12345678901", "java", "All about programming");
		});
	}

}
