/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan06;

/**
 *
 * @author DELL
 */
public class StaticNonStatic {
    // Static 
    static int staticCount = 0;

    // Non-static 
    int nonStaticCount = 0;

    // Non-static method
    void increment() {
        staticCount++;      // Static variable
        nonStaticCount++;   // Non-static variable
    }

    void display() {
        System.out.println("Static Count: " + staticCount + ", Non-Static Count: " + nonStaticCount);
    }

    // Static method
    static void showStatic() {
        System.out.println("This is a static method. Static count = " + staticCount);
    }

    public static void main(String[] args) {

        // Static method call (no object needed)
        StaticNonStatic.showStatic();

        // Non-static Object
        StaticNonStatic obj1 = new StaticNonStatic();
        StaticNonStatic obj2 = new StaticNonStatic();

        obj1.increment();
        obj2.increment();

        obj1.display();  
        obj2.display(); 

        // Another static method call
        StaticNonStatic.showStatic();
    }
}
