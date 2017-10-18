package ro.fortech.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.fortech.todo.TodoService;

@WebServlet(urlPatterns="/add-todo.do")
public class AddTodoServlet extends HttpServlet {
	
	private TodoService todoService = new TodoService();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String todo = request.getParameter("todo");
		todoService.addTodo(new Todo(todo));
		response.sendRedirect("/todo.do");
	}
	
}
