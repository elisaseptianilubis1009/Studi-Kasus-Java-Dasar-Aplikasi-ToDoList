
package aplikasitodolistoop.Test.Service;

import aplikasitodolistoop.Entity.TodoList;
import aplikasitodolistoop.Repository.TodoListRepositoryImpl;
import aplikasitodolistoop.Repository.TodoListRepository;
import aplikasitodolistoop.Service.TodoListService;
import aplikasitodolistoop.Service.TodoListServiceImpl;


public class TodoListServiceTest {
    public static void main(String[] args) {
        testShowTodoList();
    }
    
    public static void testShowTodoList(){
        TodoListRepositoryImpl todoListRepository=new TodoListRepositoryImpl();
        todoListRepository.data[0]= new TodoList("Belajar Java Dasar");
        todoListRepository.data[1]= new TodoList("Belajar Java PHP");
                
        TodoListService todoListService=new TodoListServiceImpl(todoListRepository);
        
        todoListService.showTodoList();
    }
}
