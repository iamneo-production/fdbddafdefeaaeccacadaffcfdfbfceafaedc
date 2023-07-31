@Entity
public class Task {
    @Id
    private String taskId;
    private String taskHolderName;
    private String taskDate;
    private String taskName;
    private string taskStatus;

    //setters
    public void setTaskId(String taskId){
        this.taskId = taskId;
    }
    public void setTaskHolderName(String taskHolderName){
        this.taskHolderName = taskHolderName;
    }
    public void setTaskDate(String taskDate){
        this.taskDate = taskDate;
    }
    public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
    
    //getters
    public String getTaskID() {
		return taskID;
	}
	public String getTaskHolderName() {
		return taskHolderName;
	}
	public String getTaskDate() {
		return taskDate;
	}
	public String getTaskName() {
		return taskName;
	}
	public String getTaskStatus() {
		return taskStatus;
	}

}
