/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management.Controller;

import Management.Model.Student;
import Management.Service.StudentService;

/**
 *
 * @author DELL
 */
public class StudentController {
    public Student create (Student s){
    StudentService service = new StudentService();
     Student st = service.save(s);
        return st;
    }
}
