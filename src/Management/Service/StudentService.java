/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management.Service;

import Management.DAO.StudentDAO;
import Management.Model.Student;

/**
 *
 * @author DELL
 */
public class StudentService {
    public Student save (Student s){
    StudentDAO sdao = new StudentDAO();
    return sdao.insert(s);
    }
}
