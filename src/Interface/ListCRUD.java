package Interface;

import Model.EmployeeModel;
import Exception.EmployeeAlreadyExistsException;

public interface ListCRUD {

    //Interface que possui as assinaturas dos metodos CRUD

    public void createEmployee(EmployeeModel employee) throws EmployeeAlreadyExistsException;

    public void updateEmployee(int index, EmployeeModel employee);

    public void deleteEmployee(int index);
    //public void deleteEmployee(EmployeeModel employee);

    public void searchEmployeeIndex(int index) throws EmployeeAlreadyExistsException;

    public void listEmployee();


}
