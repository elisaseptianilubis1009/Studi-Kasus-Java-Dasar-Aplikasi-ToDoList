
package aplikasitodolistoop.Service;

import aplikasitodolistoop.Entity.TodoList;
import aplikasitodolistoop.Repository.TodoListRepository;



public class TodoListServiceImpl implements TodoListService{
    
    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }
    
    

    @Override
    public void showTodoList() {
        TodoList[] model=todoListRepository.getAll();
       System.out.println("TODOLIST ");

        for (int i = 0; i < model.length; i++) {
            TodoList todoList = model[i];
            int no = i + 1;

            if (todoList != null) {
                System.out.println(no + ". " + todoList.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTodoList(Integer number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
