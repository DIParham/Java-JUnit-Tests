package module4;

public class Task {
	private static String taskID;
	private static String taskName;
	private static String taskDes;
	public Object getTaskID;
	

	public Task(String taskID, String taskName, String taskDes) {
		if(taskID == null || taskID.length()>10) {
			throw new IllegalArgumentException("Invalid Task ID");
			
		}
		if(taskName == null || taskName.length()>20) {
			throw new IllegalArgumentException("Invalid Task");
		}
		if(taskDes == null || taskDes.length()>50) {
			throw new IllegalArgumentException("Invalid Task Description");
		}
		this.taskID = taskID;
		this.taskName = taskName;
		this.taskDes = taskDes;
		
	}

	public String getTaskID() {
		return taskID;
	}

	public void setTaskID(String taskID) {
		Task.taskID = taskID;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDes() {
		return taskDes;
	}

	public void setTaskDes(String taskDes) {
		this.taskDes = taskDes;
	}
//	public String getUniqueID() {
	//	return uniqueID;
//	}

	//public String setUniqueID(String uniqueID) {
//		return this.uniqueID = uniqueID;
//	}

	
}
