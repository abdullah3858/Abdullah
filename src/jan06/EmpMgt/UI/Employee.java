/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan06.EmpMgt.UI;

/**
 *
 * @author almah
 */
public class Employee {
    String FirstName;
        String  Last_Name;
        String  Desi;
        String  Dprt;
        double Sal;
        int  Age;
        String  Address;
        
       public Employee(String FirstName, String Last_Name, String Desi, double Sal, String Address) {
        this.FirstName = FirstName;
        this.Last_Name = Last_Name;
        this.Desi = Desi;
        this.Sal = Sal;
        this.Address = Address;  
        
        
}

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getDesi() {
        return Desi;
    }

    public void setDesi(String Desi) {
        this.Desi = Desi;
    }

    public String getDprt() {
        return Dprt;
    }

    public void setDprt(String Dprt) {
        this.Dprt = Dprt;
    }

    public double getSal() {
        return Sal;
    }

    public void setSal(double Sal) {
        this.Sal = Sal;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

   
    }
