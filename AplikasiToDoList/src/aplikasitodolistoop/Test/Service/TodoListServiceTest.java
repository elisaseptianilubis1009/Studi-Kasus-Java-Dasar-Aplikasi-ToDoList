package aplikasitodolistoop.Test.Service;

import aplikasitodolistoop.Entity.TodoList;
import aplikasitodolistoop.Repository.TodoListRepositoryImpl;
import aplikasitodolistoop.Repository.TodoListRepository;
import aplikasitodolistoop.Service.TodoListService;
import aplikasitodolistoop.Service.TodoListServiceImpl;

public class TodoListServiceTest {

    public static void main(String[] args) {
//        testRemoveTodoList();
        try {
            test();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        }finally{
            System.out.println("C");
        }
    }
    
    public static void test(){}

    public static void testShowTodoList() {
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new TodoList("Belajar Java Dasar");
        todoListRepository.data[1] = new TodoList("Belajar Java PHP");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java Dasar ");
        todoListService.addTodoList("Belajaar Java OOP");
        todoListService.addTodoList("Belajar Studi Kasus Todo list  Java dasar & OOP");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java Dasar ");
        todoListService.addTodoList("Belajaar Java OOP");
        todoListService.addTodoList("Belajar Studi Kasus Todo list  Java dasar & OOP");

        todoListService.showTodoList();

        todoListService.removeTodoList(5);
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();

    }
}
