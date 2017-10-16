package ro.fortech.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.fortech.login.LoginService;
import ro.fortech.todo.TodoService;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	
	private LoginService userValidationService = new LoginService();
	private TodoService todoService = new TodoService();

	/*
	 * doGet method inherited from HttpServlet
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		boolean isUserValid = userValidationService.isUserValid(name, password);
		
		if (isUserValid) {
			response.sendRedirect("/todo.do");
		} else {
			request.setAttribute("errorMessage", "Invalid Credentials !");
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}

}
