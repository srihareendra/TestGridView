package com.service;

import java.util.List;

import com.dao.TodoDAO;
import com.model.Task;

public class BusinessService {

public static List<Task> getTaskList() {
	
	
	TodoDAO todoDAO= new TodoDAO();
	
	return todoDAO.getTaskList();

	/*List<Task> listOfTask = new LinkedList<Task>();
	listOfTask.add(new Task("Bosch", "Germny","sf", "40000"));
	listOfTask.add(new Task("XYZ", "India","2014", "10000"));
	listOfTask.add(new Task("Robotics", "United Kingdom","2011", "35000"));
	listOfTask.add(new Task("Merch", "USA","2010", "20000"));
	listOfTask.add(new Task("Foxtron", "Indonesia","2009", "15000"));
	listOfTask.add(new Task("Benz", "Germany","2013", "50000"));
	listOfTask.add(new Task("Audi", "United Kingdom","2012", "60000"));
	listOfTask.add(new Task("Hyat", "France","2011", "30000"));
	listOfTask.add(new Task("HCL", "India","2007", "23000"));
	listOfTask.add(new Task("CTS", "USA","2010", "42000"));
	listOfTask.add(new Task("Accenture", "France","2008", "15000"));
	return listOfTask;*/
}
}