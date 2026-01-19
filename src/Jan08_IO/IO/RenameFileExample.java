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
public class RenameFileExample {
    public static void main(String[] args) {
        File oldfile = new File("e:\\JavaIO.txt");
        File newfile = new File("e://javaio.txt");
        if (oldfile.renameTo(newfile)) {
            System.out.println("Rename Successful");
        }else{
            System.out.println("Rename failed.");
        }
        
    }
}
