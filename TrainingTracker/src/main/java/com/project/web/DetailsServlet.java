package com.project.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.project.DAO.DisplaytrainingDAO;
import com.project.model.TrainingModel;

/**
 * Servlet implementation class DetailsServlet
 */
@WebServlet("/Details")
public class DetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DisplaytrainingDAO dispDao;
	
	public void init() throws ServletException {
		dispDao = new DisplaytrainingDAO();
	}
 
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int id = Integer.parseInt(request.getParameter("courseID"));
		TrainingModel existingTrain;
		try {
			existingTrain = dispDao.selectTrain(id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("trainingDetails.jsp");
			request.setAttribute("train", existingTrain);
			dispatcher.forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}
