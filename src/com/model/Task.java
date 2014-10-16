package com.model;

public class Task {

	




	public Task(String id,String task,String priority, String status, String duedate) {
		this.id=id;
		this.priority = priority;
		this.status = status;
		this.duedate= duedate;
		this.task =task;
		
	}

	private String id;
	private String priority;
	private String status;
	private String duedate;
    private String task;
	
	public String getTask() {
		return task;
	}

	

	public void setTask(String task) {
		this.task = task;
	}


	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}



	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}
}