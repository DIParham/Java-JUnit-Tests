package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import module3.Contact;
import module4.Task;
import module4.TaskService;

class TaskServiceTest {
	String taskName;
	String taskDes;
	String taskID;
	
	@Test
	public void testAddTask() {
		TaskService taskservice = new TaskService();
		String taskID = "123";
		boolean ok;
		ok = taskservice.addTask(taskID,"java", "all about programming");
		Assertions.assertTrue(ok);
		
	}
	@Test
	public void testAddTaskNull() {
		String taskID = null;
		
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Task(taskID, "java", "all about programming");
		});
	}
	@Test
	public void testRemoveTask() {
		TaskService taskservice = new TaskService();
		String taskID = "123";
		boolean ok;
		ok = taskservice.addTask(taskID, "java", "all about programming");
		Assertions.assertTrue(ok);
		
		ok = taskservice.removeTask(taskID);
		Assertions.assertTrue(ok);
	}
	@Test
	public void testRemoveTaskNull() {
		String taskID = null;
		
		Assertions.assertThrows(IllegalArgumentException.class,()->{
		new Task(taskID, "java", "all about programming");
		});
	}
	@Test
	public void testUpdateTask() {
		TaskService taskservice = new TaskService();
		String taskID = "123";
		boolean ok;
		ok = taskservice.addTask(taskID, "java", "all about programming");
		Assertions.assertTrue(ok);
		ok = taskservice.updateTask(taskID, "C++", "all about programming");
		Assertions.assertTrue(ok);
	}
	@Test
	public void testUpdateTaskNull() {
		String taskID = null;
		
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Task(taskID, "java", "all about programming");
		});
	}

}
