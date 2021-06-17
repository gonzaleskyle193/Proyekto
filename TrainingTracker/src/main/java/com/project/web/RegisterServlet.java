package com.project.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.DAO.RegisterDAO;
import com.project.model.AccountModel;
import com.project.model.EmployeeModel;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("r_username");
		String password = request.getParameter("r_password");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String manager = request.getParameter("manager");
		
		RegisterDAO newRegDao = new RegisterDAO();
	
		
		
			EmployeeModel newEmp = new EmployeeModel(firstname,lastname,email,contact,manager);
			AccountModel newAcc = new AccountModel();
			newAcc.setUsername(request.getParameter(username));
			newAcc.setPassword(request.getParameter(password));
								
			newRegDao.insertInfo(newEmp);
			newRegDao.insertAcc(newAcc);
		
				
		response.sendRedirect("login.jsp");	
	}

}
