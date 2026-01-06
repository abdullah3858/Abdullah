/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan06.Practice02.Exception_Handeling;

/**
 *
 * @author almah
 */
public class A {
    public static void main(String[] args) {
        try {
            int[] arr = {15,20,25};
            System.out.println(10);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Arry Exception: " + e1);
            
        }
        
        try {
            int a = 15;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        } catch ( ArithmeticException  e2) {
            System.out.println("Arrithmatic Exception: " + e2);
           
        }
        
        try {
            String name = null;
            System.out.println(name.length());
            
        } catch (NullPointerException e3) {
            System.out.println("Null point Exception: " + e3);
            
        }
        
        
    }
  
}
