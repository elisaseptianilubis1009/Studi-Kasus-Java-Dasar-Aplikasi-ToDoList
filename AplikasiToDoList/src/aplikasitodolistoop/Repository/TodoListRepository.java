package aplikasitodolistoop.Repository;

import aplikasitodolistoop.Entity.TodoList;

public interface TodoListRepository {

    TodoList[] getAll();

    void add(TodoList todoList);

    void remove(Integer number);

}
