package com.dataTable;

import java.util.List;


import com.model.Task;

public class DataTableParameters {
	// Data table plugin parameter
	int iTotalRecords;
	int iTotalDisplayRecords;
	String sEcho;
	String sColumns;
	List<Task> aaData;

	public int getiTotalRecords() {
		return iTotalRecords;
	}

	public void setiTotalRecords(int iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}

	public int getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}

	public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}

	public String getsEcho() {
		return sEcho;
	}

	public void setsEcho(String sEcho) {
		this.sEcho = sEcho;
	}

	public String getsColumns() {
		return sColumns;
	}

	public void setsColumns(String sColumns) {
		this.sColumns = sColumns;
	}

	public List<Task> getAaData() {
		return aaData;
	}

	public void setAaData(List<Task> aaData) {
		this.aaData = aaData;
	}
}