package ro.fortech.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.fortech.todo.TodoService;

@WebServlet(urlPatterns="/todo.do")
public class TodoServlet extends HttpServlet {
	
	private TodoService todoService = new TodoService();

	/*
	 * doGet method inherited from HttpServlet
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("todos", todoService.retrieveTodos());
		request.getRequestDispatcher("WEB-INF/views/todo.jsp").forward(request, response);
	}
	
}
