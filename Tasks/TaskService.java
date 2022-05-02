package module4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskService {
	private List<Task> tasklist;
	public TaskService(){
		tasklist = new ArrayList<Task>();
	}
	
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
			
	}
	
}

