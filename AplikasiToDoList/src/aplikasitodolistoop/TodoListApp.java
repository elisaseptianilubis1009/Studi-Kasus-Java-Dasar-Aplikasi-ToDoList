
package aplikasitodolistoop;

import aplikasitodolistoop.Repository.TodoListRepository;
import aplikasitodolistoop.Repository.TodoListRepositoryImpl;
import aplikasitodolistoop.Service.TodoListService;
import aplikasitodolistoop.Service.TodoListServiceImpl;
import aplikasitodolistoop.View.TodoListView;


public class TodoListApp {
    public static void main(String[] args) {
        TodoListRepository todoListRepository= new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        
        todoListView.showTodoList();
        
        
    }
}
