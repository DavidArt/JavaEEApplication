package ro.fortech.todo;

import java.util.List;
import java.util.ArrayList;

public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo("Learn Web Application Development"));
		todos.add(new Todo("Learn Spring MVC"));
		todos.add(new Todo("Learn Spring Rest Services"));
	}
	
	public List<Todo> retrieveTodos() {
		return todos;
	}
}
