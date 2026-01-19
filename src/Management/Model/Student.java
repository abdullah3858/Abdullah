/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management.Model;

/**
 *
 * @author DELL
 */
public class Student {
    private int roll;
    private String firstName;
    private String lastName;    
    private String fatherName;
    private String motherName;
    private int age;
    private double salary;
    private String addr;

    public Student(int roll, String firstName, String lastName, String fatherName, String motherName, int age, double salary, String addr) {
        this.roll = roll;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.age = age;
        this.salary = salary;
        this.addr = addr;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Student{" + "roll=" + roll + ", firstName=" + firstName + ", lastName=" + lastName + ", fatherName=" + fatherName + ", motherName=" + motherName + ", age=" + age + ", salary=" + salary + ", addr=" + addr + '}';
    }
    

    
    
    
}
