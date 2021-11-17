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
public class TodoListRepositoryImpl implements TodoListRepository {

    public TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return data;
    }

    public boolean isFull() {
        //cek index model apakah ada yang null
        boolean isFull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void resizeIfFull(){
        //Resize length model jika full
        if (isFull()) {
            TodoList[] temp = data;
            data = new TodoList[data.length * 2];

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        } 
    }
    @Override
    public void add(TodoList todoList) {
        resizeIfFull();
        //tambah todo ke model
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = todoList;
                    break;
                }
            }

    }

    @Override
    public boolean remove(Integer number) {
        if ((number - 1) >= data.length) {
            return false;
        } else if (data[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < data.length; i++) {
                if (i == data.length - 1) {
                    data[i] = null;
                } else {
                    data[i] = data[i + 1];
                }

            }
            return true;
        }
    }

}
