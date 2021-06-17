package com.project.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.DAO.ReceiptDAO;
import com.project.model.ReceiptModel;



/**
 * Servlet implementation class ReceiptServlet
 */
@WebServlet("/receipt")
public class ReceiptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReceiptDAO userDao; 
	   
	public void init() throws ServletException {
			userDao = new ReceiptDAO();
	}

	   
	   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			addTraining(request,response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	private void addTraining(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, NumberFormatException {
		PrintWriter pwriter = response.getWriter();
		HttpSession session=request.getSession();
	    session.getAttribute("username");
	
		String username = (String) session.getAttribute("username");
		String coursename= request.getParameter("courseName");
		
		ReceiptModel receipt = new ReceiptModel(username, coursename);		
		userDao.insertReceipt(receipt);
		response.sendRedirect("TrainingServlet");
			
			
	}
}
