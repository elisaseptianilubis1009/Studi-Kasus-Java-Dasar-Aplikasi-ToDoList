/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasitodolistoop.Utils;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class InputUtil {
    
    private static  Scanner  scanner= new Scanner(System.in);
    
    
     public static String input(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(info);
        String name = scanner.nextLine();
        return name;
    }
    
}
