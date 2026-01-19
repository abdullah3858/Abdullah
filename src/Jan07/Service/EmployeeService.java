/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan07.Service;

import Jan07.DAO.EmployeeDAO;

import Jan07.Model.Employee;
/**
 *
 * @author DELL
 */
public class EmployeeService {
    public Employee save(Employee e){
       
        EmployeeDAO edao = new EmployeeDAO();
        return edao.insert(e);
        
    }
}
