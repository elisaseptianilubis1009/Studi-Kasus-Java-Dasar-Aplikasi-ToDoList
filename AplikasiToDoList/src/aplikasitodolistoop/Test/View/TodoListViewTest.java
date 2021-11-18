/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasitodolistoop.Test.View;

import aplikasitodolistoop.Repository.TodoListRepository;
import aplikasitodolistoop.Repository.TodoListRepositoryImpl;
import aplikasitodolistoop.Service.TodoListService;
import aplikasitodolistoop.Service.TodoListServiceImpl;
import aplikasitodolistoop.View.TodoListView;

/**
 *
 * @author admin
 */
public class TodoListViewTest {

    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepository todoListReposotory = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListReposotory);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java Oop");
        todoListService.addTodoList("Implemnt studi kasus TodoList");

        todoListView.showTodoList();

    }

    public static void testAddTodoList() {
        TodoListRepository todoListReposotory = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListReposotory);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.addTodoList();
        todoListService.showTodoList();

    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListReposotory = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListReposotory);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java Oop");
        todoListService.addTodoList("Implemnt studi kasus TodoList");

        todoListService.showTodoList();
        todoListView.removeTodoList();
        todoListService.showTodoList();
    }

}
