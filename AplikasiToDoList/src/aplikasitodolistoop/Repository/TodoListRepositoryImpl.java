/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasitodolistoop.Repository;

import aplikasitodolistoop.Entity.TodoList;

/**
 *
 * @author admin
 */
public class TodoListRepositoryImpl implements TodoListRepository{

    public TodoList[] data= new TodoList[10];
    
    @Override
    public TodoList[] getAll() {
        return data;
    }

    @Override
    public void add(TodoList todoList) {
    }

    @Override
    public void remove(Integer number) {
    }
    
}
