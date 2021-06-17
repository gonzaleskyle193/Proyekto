package com.project.web;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class MyTrainingServlet
 */
@WebServlet("/MyTrainingServlet")
public class MyTrainingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReceiptDAO  recDao;       

	public void init() throws ServletException {
		recDao = new ReceiptDAO();
	}
	  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String username = (String) session.getAttribute("username");
		
		List<ReceiptModel> mylist;
		try {
			mylist = recDao.MyTraining(username);
			request.setAttribute("mylist", mylist);
			RequestDispatcher dispatcher = request.getRequestDispatcher("myTraining.jsp");
			dispatcher.forward(request, response);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
