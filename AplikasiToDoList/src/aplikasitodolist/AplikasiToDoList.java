package aplikasitodolist;

import java.util.Scanner;

public class AplikasiToDoList {

    public static String[] model = new String[10];

    public static void main(String[] args) {
       viewShowTodoList();
    }

    //Menampilkan Todo List
    public static void showTodoList() {
        System.out.println("TODOLIST ");

        for (int i = 0; i < model.length; i++) {
            String todo = model[i];
            int no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
//        model[0] = "Belajar Java Dasar";
//        model[1] = "Membuat Studi Kasus Todo List";
        showTodoList();
    }

    //Menambakan Todo ke list
    public static void addTodoList(String todo) {

        //cek index model apakah ada yang null
        boolean isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        //Resize length model jika full
        if (isFull) {
            String[] temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        //tambah todo ke model
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }

    }

    public static void testAddTodoList() {
        for (int i = 0; i < 25; i++) {
            addTodoList("Data To Do List ke - " + i);
        }

    }

    //Mengahpus TodoList
    public static boolean removeTodoList(Integer number) {

        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < model.length; i++) {
                if (i == model.length - 1) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }

            }
            return true;
        }

    }

    public static void testRemoveTodoList() {
        addTodoList("Data 1 ");
        addTodoList("Data 2 ");
        addTodoList("Data 3 ");
        addTodoList("Data 4 ");
        addTodoList("Data 5 ");
        addTodoList("Data 6 ");

        boolean result = removeTodoList(20);
        System.out.println(result);

        boolean result2 = removeTodoList(4);
        System.out.println(result2);

        boolean result3 = removeTodoList(11);
        System.out.println(result3);
    }

    public static String input(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(info);
        String name = scanner.nextLine();
        return name;
    }

    public static void testInput() {
        String name = input("Input Your name : ");
        System.out.println("Hi, " + name);

        String profesi = input("Input Your Profesi : ");
        System.out.println(profesi);
    }

    //Menampilkan view todo list
    public static void viewShowTodoList() {
        while (true) {
            showTodoList();

            System.out.println("Menu :");
            System.out.println("1. Tambah ");
            System.out.println("2. Hapus ");
            System.out.println("x. Keluar ");
            String pilih = input("Pilih :");

            if (pilih.equals("1")) {
                viewAddTodoList();
            } else if (pilih.equals("2")) {
                viewRemoveTodoList();
            } else if (pilih.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti!");
            }
        }

    }

    public static void testViewShowTodoList() {
        addTodoList("Data 1 ");
        addTodoList("Data 2 ");
        addTodoList("Data 3 ");
        addTodoList("Data 4 ");
        addTodoList("Data 5 ");
        viewShowTodoList();

    }

    //Memanpilkan view menambahkan todo List
    public static void viewAddTodoList() {
        System.out.println("Menambahkan TODOLIST ");
        String todo = input("Todo (X untuk keluar) :");
        if (todo.equals("x")) {
            //batal
        }else{
            addTodoList(todo);
        }

    }
    
    public static void testViewAddTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        viewAddTodoList();
        showTodoList();
    }

    //Menampilkan view menghapus todo List
    public static void viewRemoveTodoList() {
        System.out.println("Menghapus TODOLIST ");
        String number = input("Number (x untuk keluar) :");
        if(number.equals("x")){
            //batal
        }else{
            boolean success=removeTodoList(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal Menghapus TODOLIST!");
            }
        }

    }
    
    public static void testViewRemoveTodoList(){
        
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        
        showTodoList();
        
        viewRemoveTodoList();
        
        showTodoList();
    }
}
