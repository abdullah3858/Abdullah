/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan06;

/**
 *
 * @author almah
 */
public class Employee {
    private int  id;
    private String Name;
    private double Salary;

    public Employee(int id, String Name, double Salary) {
        this.id = id;
        this.Name = Name;
        this.Salary = Salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }


}
