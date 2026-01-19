/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author DELL
 */
public class ThreadTest {
    public static void main(String[] args) {
//        MyThread t = new MyThread();
//        t.start();
//        for (int i = 0; i <=5; i++) {
//            System.out.println("Main thread: " + i);
//        }
        NewThread n = new NewThread();
        n.start();
        for (int i = 5; i <= 10; i++) {
            System.out.println("Parent Thread: " +i);
        }
    }
        
        
}
 //class MyThread extends Thread{
//  @Override
//  public void run() {
//    for (int i = 1; i <= 5; i++) {
//    System.out.println("Child Thread: " + i);
//        }
//    }
//    
 //}
 
 class NewThread extends Thread{
     @Override
     public void run(){
         for (int i = 5; i <=10; i++) {
             System.out.println("Child thread: "+ i);
         }
    
     }
 }
    