package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.dataTable.DataTableParameters;
import com.model.Task;
import com.service.BusinessService;

public class DataTableServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		// Call business service class to get list of company
		List<Task> listOfTask = BusinessService.getTaskList();

		DataTableParameters dataTableParam = new DataTableParameters();
		// Set the list fetched in aaData
		dataTableParam.setAaData(listOfTask);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		// Convert Java Object to Json
		String json = gson.toJson(dataTableParam);

		response.getWriter().print(json);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}