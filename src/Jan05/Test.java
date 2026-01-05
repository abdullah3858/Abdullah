/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author almah
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person (101, "Abdullah", 25000);
        Person p2 = new Person (102, "Abdullah", 30000);
        Person p3 = new Person (103, "Abdullah", 35000);
        
        List<Person> per = new ArrayList<>();
        per.add(p1);
       per.add(p2);
        per.add(p3);

        for (Person per1 : per) {
            System.out.println(per1);
        }
    }
    
}
