package com.dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.model.Task;
 
public class TodoDAO {
 
	Connection connection=null;
	public TodoDAO(){
		
		System.out.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");
 
		try {
 
			Class.forName("org.postgresql.Driver");
 
		} catch (ClassNotFoundException e) {
 
			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return;
 
		}
		System.out.println("PostgreSQL JDBC Driver Registered!");
  
		
		try {
 
				connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/testdb", "postgres","admin");
				
				//Statement insertStmt = connection.createStatement();
	            //insertStmt.execute("INSERT INTO Task (TASK_ID,TASK_NAME,TASK_Priority,TASK_Duedate) VALUES (1,'test','low','23-10-2015')");
	             	            
 
		} catch (SQLException e) {
 
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
 
		}
	
	}
	public   List<Task> getTaskList() {
		List<Task> listOfTask = new LinkedList<Task>();
		
		Statement selectStmt = null;
		try {          	             
	            selectStmt = connection.createStatement();
	            ResultSet rs = selectStmt.executeQuery("select * from Task;");
	            while(rs.next())
	            {
	            	
	            	listOfTask.add(new Task(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5)));
	                /*System.out.println(rs.getString(1));    //First Column
	                System.out.println(rs.getString(2));    //Second Column
	                System.out.println(rs.getString(3));    //Third Column
	                System.out.println(rs.getString(4));    //Fourth Column
*/	            }
 
		} catch (SQLException e) {
 
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}


		/*listOfTask.add(new Task("Bosch", "Germny","sf", "40000"));
		listOfTask.add(new Task("XYZ", "India","2014", "10000"));
		listOfTask.add(new Task("Robotics", "United Kingdom","2011", "35000"));
		listOfTask.add(new Task("Merch", "USA","2010", "20000"));
		listOfTask.add(new Task("Foxtron", "Indonesia","2009", "15000"));
		listOfTask.add(new Task("Benz", "Germany","2013", "50000"));
		listOfTask.add(new Task("Audi", "United Kingdom","2012", "60000"));
		listOfTask.add(new Task("Hyat", "France","2011", "30000"));
		listOfTask.add(new Task("HCL", "India","2007", "23000"));
		listOfTask.add(new Task("CTS", "USA","2010", "42000"));
		listOfTask.add(new Task("Accenture", "France","2008", "15000"));*/
		
		return listOfTask;
		 
		
	}
	
	
 
}