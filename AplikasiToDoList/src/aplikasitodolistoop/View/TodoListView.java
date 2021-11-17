
package aplikasitodolistoop.View;

import aplikasitodolistoop.Service.TodoListService;
import aplikasitodolistoop.Utils.InputUtil;

public class TodoListView {
    
    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }
    
    
    
    public  void showTodoList(){
        
        while (true) {
            todoListService.showTodoList();

            System.out.println("Menu :");
            System.out.println("1. Tambah ");
            System.out.println("2. Hapus ");
            System.out.println("x. Keluar ");
            String pilih = InputUtil.input("Pilih :");

            if (pilih.equals("1")) {
                addTodoList();
            } else if (pilih.equals("2")) {
                removeTodoList();
            } else if (pilih.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti!");
            }
        }
    
    }
    
    public void addTodoList(){
        
        System.out.println("Menambahkan TODOLIST ");
        String todo = InputUtil.input("Todo (X untuk keluar) :");
        if (todo.equals("x")) {
            //batal
        }else{
            todoListService.addTodoList(todo);
        }
    
    }
    
    public void removeTodoList(){
        
        System.out.println("Menghapus TODOLIST ");
        String number = InputUtil.input("Number (x untuk keluar) :");
        if(number.equals("x")){
            //batal
        }else{
           todoListService.removeTodoList(Integer.valueOf(number));
        }
    
    }
}
