/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan08_IO.IO;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author almah
 */
public class CreateFileExample {
    public static void main(String[] args) {
        
        try {
        File file = new File("e:\\JavaIO.txt");
            if (file.createNewFile()) {
                System.out.println("File is Create.");
            }else{
                System.out.println("File alrteady creaded");
            }
          
        } catch (IOException e) {
            e.printStackTrace();
            
        }

    }
}
