
package aplikasitodolist;

public class AplikasiToDoList {

    public static String[] model= new String[10];
    
    public static void main(String[] args) {
        testShowTodoList();
    }
    
    //Menampilkan Todo List
    public static void showTodoList(){
        for (int i=0;i<model.length;i++) {
            String todo=model[i];
            int no=i+1;
            
            if(todo != null){
                System.out.println(no +". "+ todo);
            }
        }
    }
    
    public static void testShowTodoList(){
        model[0]="Belajar Java Dasar";
        model[1]="Membuat Studi Kasus Todo List";
        showTodoList();
    }
    
    //Menambakan Todo ke list
    public static void addTodoList(){
    
    }
    
    //Mengahpus TodoList
    public static void removeTodoList(){
    
    }
    
    //Menampilkan view todo list
    public static void viewShowTodoList(){
    
    }
    
    //Memanpilkan view menambahkan todo List
    public static void viewAddTodoList(){
    
    }
    
    //Menampilkan view menghapus todo List
    public static void viewRemoveTodoList(){
    
    }
}
