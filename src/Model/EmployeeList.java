package Model;

import Interface.ListCRUD;
import java.util.ArrayList;
import Exception.EmployeeAlreadyExistsException;
import Enums.MessageEnum;

public class EmployeeList implements ListCRUD {

    ArrayList<EmployeeModel> employeeList = new ArrayList<>();

    @Override
    public void createEmployee(EmployeeModel employee) throws EmployeeAlreadyExistsException {
        for (EmployeeModel emp: employeeList){
            if (emp.getId() == employee.getId()){
                throw new EmployeeAlreadyExistsException("Employee with id "
                        + employee.getId() + " already exists");
            }
        }
        if (employeeList.add(employee)){
            System.out.println("Employee "+ employee.getName() +" add!");
        }else{
            throw new RuntimeException(MessageEnum.FAILED_ADD_EMPLOYEE.getMensage());
        }
    }

    @Override
    public void updateEmployee(int index, EmployeeModel employee) {
        if (index >=0 && index < employeeList.size()){
            employeeList.set(index,employee);
            System.out.println(MessageEnum.EMPLOYEE_UPDATE_SUCESS_MESSAGE.getMensage());
        }else{
            throw new RuntimeException(MessageEnum.EMPLOYEE_NOT_FOUND_MESSAGE.getMensage());
        }
    }

    @Override
    public void searchEmployeeIndex(int index) throws EmployeeAlreadyExistsException {
        if (index >=0 && index < employeeList.size()){
            System.out.println(employeeList.get(index));
        }else {
            throw new EmployeeAlreadyExistsException("Employee id not found!");
        }
    }

    @Override
    public void deleteEmployee(int index) {
        if (index >= 0 && index < employeeList.size()) {
            employeeList.remove(index);

            System.out.println(MessageEnum.EMPLOYEE_REMOVED_SUCESS_MESSAGE.getMensage());
        } else {
            throw new RuntimeException(MessageEnum.INDEX_ERROR_MESSAGE.getMensage());
        }
    }

    @Override
    public void listEmployee() {
        if (employeeList.isEmpty()){
            throw new RuntimeException(MessageEnum.EMPTY_LIST_MESSAGE.getMensage());
        }else {
            for (EmployeeModel emp: employeeList){
                System.out.println(emp);
            }
        }
     }
}
