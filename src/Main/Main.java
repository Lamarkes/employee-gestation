package Main;

import Entities.Analyst;
import Entities.Manager;
import Entities.Programmer;
import Exception.EmployeeAlreadyExistsException;
import Model.BinarySearch;
import Model.CalculatorSalary;
import Model.EmployeeList;
import java.util.Locale;
public class Main {
    public static void main(String[] args) throws EmployeeAlreadyExistsException {
       Locale.setDefault(Locale.US);
        CalculatorSalary calculatorSalary = new CalculatorSalary();
        EmployeeList employeeList = new EmployeeList();

        Manager manager1 = new Manager("Steve Jobs",42,"9821221",
                5000,52,"sector02",5);

        Analyst analyst1 = new Analyst("Carlos Antonio",
                19,"1234",1300,60,
                true,"junior","better-analysis",3);

        Analyst analyst2 = new Analyst("Leonardo DiCaprio",
                32,"983212",2500,38,
                true,"Pleno"," Business-Intelligence",2);

        Programmer programmer1 = new Programmer("Tony Stark",23,
                "098732",2500,32,"Java",
                "communication","junior", true,"spring-boot");

        Programmer programmer2 = new Programmer("Ryan Reynolds",29,
                "65092132",3100,41,"Python",
                "team work","pleno", true,"django-framework");


        employeeList.createEmployee(manager1);

        employeeList.createEmployee(analyst1);
        employeeList.createEmployee(analyst2);
        employeeList.createEmployee(programmer1);
        employeeList.createEmployee(programmer2);

        employeeList.listEmployee();

        System.out.println("-----------------------------");

        employeeList.updateEmployee(2, new Analyst("Gregorio",
                35,"76323212",2500,12,
                true,"Pleno","Business-Intelligence",1));

        employeeList.listEmployee();

       employeeList.searchEmployeeIndex(0);

        employeeList.deleteEmployee(3);

        System.out.println("-------------------------------");

       employeeList.listEmployee();

       calculatorSalary.calculatorSalaryFinal(analyst1);


        System.out.println(BinarySearch.binarySearch(employeeList, 2));


    }
}