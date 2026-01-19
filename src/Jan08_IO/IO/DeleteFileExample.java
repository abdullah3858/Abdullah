/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan08_IO.IO;

import java.io.File;

/**
 *
 * @author almah
 */
public class DeleteFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("e:\\javaio.txt");
          //  File file2 = new File("e://javaid.txt");
          //  System.out.println(file.);
            if (file.delete()) {
                System.out.println( file.getName() + " is deleted");
            }else{
                System.out.println("File is not deleted");
            }
        } catch (Exception e) {
            
        }
    }
}
